package coroutine

import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.util.concurrent.Executors

/**
 * 코루틴을 사용하는 사용자 정의 스레드 풀을 제공하고 싶다.
 * 자바 ExecutorService 의 asConroutineDispatcher 함수를 사용한다.
 */
fun exampleOfCustomCoroutineDispatcher() {
    case1()
    case2()
    case3()
}

fun case1() = runBlocking {
    val dispatcher = Executors.newFixedThreadPool(10).asCoroutineDispatcher()

    withContext(dispatcher) {
        delay(100L)
        println(Thread.currentThread().name)
    }

    // close 하지 않으면 main 함수는 종료하지 않는다.
    dispatcher.close()
}

fun case2() = runBlocking {
    val pool = Executors.newFixedThreadPool(10)

    withContext(pool.asCoroutineDispatcher()) {
        delay(100L)
        println(Thread.currentThread().name)
    }

    pool.shutdown()
}

fun case3() = runBlocking {
    Executors.newFixedThreadPool(10).asCoroutineDispatcher().use {
        withContext(it) {
            for (num in 0..10) {
                delay(100L)
                println(Thread.currentThread().name)
            }
        }
    }
}
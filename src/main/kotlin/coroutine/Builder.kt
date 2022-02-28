package coroutine

import kotlinx.coroutines.*
import kotlin.random.Random


/**
 * 코루틴을 생성하는 올바른 함수를 선택해야 한다.
 * 사용 가능한 빌더 함수 중에 선택한다.
 */
suspend fun exampleOfCoroutineBuilder() {
    asyncScope()
}

/**
 * 현재 스레드를 블록하고 모든 내부 코루틴이 종료될 때까지 블록한다.
 * 명령줄 검증 또는 테스트에 유용하다.
 */
private fun runBlockingScope() {
    println("Before creating coroutine")
    runBlocking {
        print("Hello, ")
        delay(200L)
        println("World!")
    }
    println("After coroutine is finished")
}

/**
 * 독립된 프로세스를 실행하는 코루틴을 시작하고, 해당 코루틴에서 리턴값을 받을 필요가 없다면 launch 코루틴 빌더를 사용하자.
 * CoroutineScope 안에서만 사용이 가능하다.
 */
private fun launchScope() {
    println("Before runBlocking")
    runBlocking {
        println("Before launch")
        launch {
            print("Hello, ")
            delay(200L)
            println("World!")
        }
        println("After launch")
    }
    println("After runBlocking")
}

/**
 * 값을 리턴해야 하는 경우에는 일반적으로 async 빌더를 사용하자.
 * coroutineScope 안에 하나의 코루틴이 실패하면 모든 코루틴이 취소될 수 있다.
 * 모든 코루틴이 종료될 때 까지 기다린다.
 */
private suspend fun asyncScope() {
    coroutineScope {
        val firstSum = async {
            println(Thread.currentThread().name)
            add(2,2)
        }

        val secondSum = async {
            println(Thread.currentThread().name)
            add(3,4)
        }

        println("Awaiting concurrent sums....")
        val total = firstSum.await() + secondSum.await()
        println("Total is $total")
    }
}

private suspend fun add(x: Int, y: Int): Int {
    delay(Random.nextLong(1000L))
    return x + y
}
package additionals

import kotlin.concurrent.thread
import kotlin.random.Random
import kotlin.random.nextLong

/**
 * 코드 블록을 동시적 스레드에서 실행하고 싶다.
 * kotlin.concurrent 패키지의 thread 함수를 사용한다.
 */
fun exampleOfStartThread(){
    join()
}

private fun notJoin() {
    (0..5).forEach {
        val sleepTime = Random.nextLong(0..1000L)
        thread {
            Thread.sleep(sleepTime)
            println("${Thread.currentThread().name} for $it after ${sleepTime}ms")
        }
    }
}

private fun join() {
    (0..5).forEach {
        val sleepTime = Random.nextLong(0..1000L)
        thread {
            Thread.sleep(sleepTime)
            println("${Thread.currentThread().name} for $it after ${sleepTime}ms")
        }.join()
    }
}
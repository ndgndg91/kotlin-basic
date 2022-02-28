package coroutine

import kotlinx.coroutines.*

/**
 * 코루틴 내의 비동기 처리를 취소하고 싶다.
 * launch 빌더 또는 withTimeout 이나 withTimeoutOrNull 같은 함수가 리턴하는 Job 레퍼런스를 사용한다.
 */
fun exampleOfCancelCoroutine() {
    cancelAndJoin()
    withTimeOuts()
    withTimeOutOrNulls()
}

fun cancelAndJoin() = runBlocking{
    val job = launch {
        repeat(100) { i ->
            println("job : I'm waiting $i....")
            delay(100L)
        }
    }
    delay(500L)
    println("main: That's enough waiting")
    job.cancel()
    job.join()
//    job.cancelAndJoin()
    println("main: Done")
}

/**
 * TimeoutCancellationException 을 던지고 종료한다.
 */
fun withTimeOuts() = runBlocking {
  withTimeout(1000L) {
      repeat(50) {
          println("job : I'm waiting $it....")
          delay(100L)
      }
  }
}

fun withTimeOutOrNulls() = runBlocking {
    withTimeoutOrNull(1000L) {
        repeat(50) {
            println("job : I'm waiting $it....")
            delay(100L)
        }
    }
}
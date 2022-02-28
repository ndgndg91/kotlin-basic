package coroutine

import kotlinx.coroutines.*

/**
 * async 로 코루틴을 시작하고 바로 다음에 코루틴이 완료될 동안 기다리는 await 코드를 간소화하고 싶다.
 * async/await 조합을 withContext 로 변경한다.
 */
fun exampleOfWithContext() {
    runBlocking {
        val result1 = retrieve1("naver.com")
        val result2 = retrieve2("naver.com")
        println("printing result on ${Thread.currentThread().name} $result1")
        println("printing result on ${Thread.currentThread().name} $result2")
    }
}

suspend fun retrieve1(url: String) = coroutineScope {
    async(Dispatchers.IO) {
        println("Retrieving data on ${Thread.currentThread().name}")
        delay(100L)
        "asyncResults"
    }.await()
}

suspend fun retrieve2(url: String) = withContext(Dispatchers.IO) {
    println("Retrieving data on ${Thread.currentThread().name}")
    delay(100L)
    "withContextResults"
}
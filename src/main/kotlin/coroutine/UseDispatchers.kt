package coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

/**
 * I/O 또는 다른 작업을 위한 전용 스레드 풀을 사용해야 한다.
 * Dispatchers 클래스에서 적당한 디스패처를 사용한다.
 *
 * 코루틴은 CoroutineContext 타입의 컨텍스트 내에서 실행된다. 코루틴 컨텍스트에는 CoroutineDispatcher 클래스의 인스턴스에 해당하는 코루틴
 * 디스패처가 포함된다.
 * 디스패처는 코루틴이 어떤 스레드 또는 스레프 풀에서 코루틴을 실행할지 결정한다.
 *
 * Dispatchers.Default
 * Dispatchers.IO
 * Dispatchers.Unconfined - application 코드에서 사용해서는 안된다.
 */
fun exampleOfDisPatchers() = runBlocking {
    launchWithIO()
    launchWithDefault()
}

suspend fun launchWithIO(){
    withContext(Dispatchers.IO) {
        delay(100L)
        println("Using Dispatchers.IO")
        println(Thread.currentThread().name)
    }
}

suspend fun launchWithDefault() {
    withContext(Dispatchers.Default) {
        delay(100L)
        println("Using Dispatchers.Default")
        println(Thread.currentThread().name)
    }
}
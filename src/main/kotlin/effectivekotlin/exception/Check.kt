package effectivekotlin.exception

/**
 * 어떤 구체적인 조건을 만족할 때만 함수를 사용할 수 있게 해야 할 때가 있다.
 * - 어떤 객체가 미리 초기화되어 있어야만 처리를 하게 하고 싶은 함수
 * - 사용자가 로그인했을 때만 처리를 하게 하고 싶은 함수
 * - 객체를 사용할 수 있는 시점에 사용하고 싶은 함수
 */

object Engine {
    private var isInitialized: Boolean = false

    fun initialize() {
        isInitialized = true
        println("Engine is initialized.")
    }

    @Throws(IllegalStateException::class)
    fun run() {
        check(isInitialized) { "Engine must be initialized."}
        println("Engine start running!")
    }
}

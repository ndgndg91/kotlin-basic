package effectivekotlin.exception

/**
 * 함수를 정의할 때 타입 시스템을 활용해서 argument 에 제한을 거는 코드를 사용.
 */
@Throws(IllegalArgumentException::class)
private fun factorial(n: Int): Int {
    require(n >= 0) { "Cannot calculate factorial of $n because it is smaller than 0"}
    return if (n <= 1) 1 else factorial(n - 1) * n
}

@Throws(IllegalArgumentException::class)
private fun sendEmail(user: User, message: String) {
    requireNotNull(user.email) { "user email must not be null"}
    require(isValidEmail(user.email)) { "user email is invalid format"}
    TODO("send email")
}

fun isValidEmail(email: String): Boolean {
    TODO("validation for email regex")
}

private data class User(val email: String)


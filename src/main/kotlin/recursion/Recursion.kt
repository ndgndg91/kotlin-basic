package recursion

/**
 * fibonacciRecursive(150) 경우, 성능이 저하된다
 * 그 이상은 stack overflow 가 발생 할 수 있다.
 */
fun fibonacciRecursive(value: Int): Int = when(value) {
    0 -> 0
    1 -> 1
    else -> fibonacciRecursive(value -2) + fibonacciRecursive(value - 1)
}

/**
 * 종료조건(edge condition) 정의
 * 함수의 입력을 분할하여 어떤 부분에서 재귀 호출을 할지 결정
 * 함수의 입력값이 종료조건으로 수렴하도록 재귀 호출의 입력값을 결정
 */

fun List<Int>.head() = first()
fun List<Int>.tail() = drop(1)

fun exampleRecursiveMaximumInList() {
    println(maximum(listOf(1,2,3,45,56,8,9)))
    println(reverse("abcd"))
    println(power(2.0, 10))
    println(factorial(0))
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))
    println(factorial(4))
}

private fun maximum(list: List<Int>): Int = when {
    list.isEmpty() -> error("list is empty")
    list.size == 1 -> list[0]
    else -> {
        val head = list.head()
        val tail = list.tail()
        val max = maximum(tail)
        if (head > max) head else max
    }
}

fun String.head() = first()
fun String.tail() = drop(1)

private fun reverse(value: String): String = when {
    value.isEmpty() -> ""
    else -> reverse(value.tail()) + value.head()
}

private fun power(x: Double, n: Int): Double = when (n) {
    0 -> 1.0
    1 -> x
    else -> {
        x * power(x, n - 1)
    }
}

private fun factorial(n: Int): Int = when (n) {
    0 -> 1
    else -> {
        n * factorial(n - 1)
    }
}
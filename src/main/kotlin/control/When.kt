package control

import classInKotlin.User

fun patternMatching(x: Int) {
    when (x) {
        1 -> println("x == 1")
        2, 3 -> println("x == 2 or 3")
        else -> println("x is more than 3")
    }
}

fun patternMatching2(x: Int): String {
    return when {
        x == 0 -> "ONE"
        x > 0 -> "POSITIVE"
        else -> "NEGATIVE"
    }
}

// Any In kotlin is equal to Object in Java
fun checkCondition(value: Any) = when {
    value == "kotlin" -> "kotlin"
    value in 1..10 -> "1..10"
    value === User("Joe", 76) -> "=== User"  // === 는 객체의 주소값을 비교
    value == User("Joe", 76) -> "== User(Joe, 76)" // == 는 객체의 값을 비교한다. equals and hashcode
    value is User -> "is User"
    else -> "SomeValue"
}

fun sum(numbers: List<Int>): Int = when {
    numbers.isEmpty() -> 0
    else -> numbers.first() + sum(numbers.drop(1))
    // drop first 1 element and recursive call
}

fun patternMatchingExample() {
    patternMatching(1)
    val patternMatching2 = patternMatching2(0)
    println(patternMatching2)
    println()
    println(checkCondition("kotlin"))
    println(checkCondition(5))
    println(checkCondition(User("Joe", 76)))
    println(checkCondition(User("Sandy", 65)))
    println(checkCondition("Unknown"))

    println(sum(listOf(10,200,300)))
    println(sum(listOf()))
}


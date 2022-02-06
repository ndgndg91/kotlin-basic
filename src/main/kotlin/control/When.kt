package control

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

fun patternMatchingExample() {
    patternMatching(1)
    val patternMatching2 = patternMatching2(0)
    println(patternMatching2)
}
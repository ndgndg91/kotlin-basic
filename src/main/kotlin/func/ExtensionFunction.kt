package func

fun Int.product(x: Int): Int {
    return this * x
}

fun extensionFuncExample() {
    println("10 * 2 = ${10.product(2)}")
    println("Kotlin".hello())
}

fun String.hello(): String {
    return "hello, $this"
}
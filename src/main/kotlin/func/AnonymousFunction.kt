package func

fun sum(x: Int, y: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(x, y)
}

fun anonymousFunctionExample() {
    val value = sum(33, 55) { x, y -> x + y }
    println("anonymous function : $value")
}
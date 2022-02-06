package func

fun twice1(value: Int): Int {
    return value * 2
}

fun twice2(value: Int): Int = value * 2

fun twice3(value: Int) = value * 2

fun add1(x: Int, y: Int): Int {
    return x + y
}

fun add2(x: Int, y: Int): Int = x + y

fun add3(x: Int, y: Int) = x + y

fun addWithDefaultValue(x: Int = 10, y: Int = 10) = x + y
package control

fun bigger1(x: Int, y: Int): Int {
    val biggerValue: Int
    if (x > y) {
        biggerValue = x
    } else {
        biggerValue = y
    }

    return biggerValue
}

fun bigger2(x: Int, y: Int): Int {
    return if (x > y) x else y
}

fun bigger3(x: Int, y: Int): Int = if (x > y) x else y
fun bigger4(x: Int, y: Int) = if (x > y) x else y
package collections

// 값이 range 에 포함되면 해당 값을 아니면 경계값을 return
fun exampleOfCoerceIn() {
    val range = 3..8

    println(1.coerceIn(range))
    println(5.coerceIn(range))

    val min = 2
    val max = 6
    println(1.coerceIn(min, max))
    println(4.coerceIn(min, max))
}
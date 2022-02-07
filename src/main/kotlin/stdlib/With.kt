package stdlib

fun exampleOfWith() {
    val human = Human("엠마", 29)
    println(human)
    val result = with(human) {
        name = "김성은"
        this
    }
    println(result)
    println("human == result : ${human == result}")
    println("human === result : ${human === result}")
}
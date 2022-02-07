package stdlib

fun exampleOfAlso() {
    val human = Human("남동길", 32)
    println(human)
    val also = human.also { it.name = "동길" }
    println(also)
}
package stdlib

/**
 * 코드 흐름을 방해하지 않고 메세지를 출력하거나 다른 부수 효과를 생성하고 싶다.
 */
fun exampleOfAlso() {
    val human = Human("남동길", 32)
    println(human)
    val also = human.also { it.name = "동길" }.also { println(it) }
    println(also)
}
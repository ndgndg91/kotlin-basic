package stdlib

import java.math.BigDecimal
import java.util.*

/**
 * 오직 null 이 아닌 레퍼런스의 코드 블록을 실행하고 싶지만 레퍼런스가 null 이라면 기본값을 리턴하고 싶을 경우.
 */
private fun processString(str: String?) =
    str?.let { it ->
        when {
            it.isEmpty() -> "Empty"
            it.isBlank() -> "Blank"
            else -> it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }
    } ?: "Null"

/**
 * 연산 결과를 임시 변수에 할당하지 않고 처리하고 싶다.
 */
private fun printWithLet(){
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let(::println)
}

fun exampleOfLet() {
    val human = Human("남동길", 32)
    printHumanWithLet(human)
    human.name = "동길"
    printHumanWithLet(human)

    // let 을 통해서 객체를 변경
    human.let {
        it.name = "기리"
    }

    printHuman(human)

    val fiveHundredWon = Money(BigDecimal(500), Currency.KRW)
    val s500won = makeMoneyString(fiveHundredWon)
    println(s500won)
}

fun makeMoneyString(money: Money?) {
    money?.let { it.value.toPlainString() + it.currency.name }
}

fun printHuman(human: Human?) {
    if (human != null) {
        println(human)
    }
}

// human 이 null 이 아닐때만 출력한다.
fun printHumanWithLet(human: Human?) {
    human?.let { println(human) }
}

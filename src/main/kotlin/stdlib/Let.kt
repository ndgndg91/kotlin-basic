package stdlib

import java.math.BigDecimal

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
    val s500won =  makeMoneyString(fiveHundredWon)
    println(s500won)
}
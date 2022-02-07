package classInKotlin

import java.math.BigDecimal

class User(var name:String, val age: Int = 30)

data class Money(var value: BigDecimal, val currency: Currency )

enum class Currency() {
    KRW,
    USD
}

fun exampleClass() {
    val ndg = User("남동길", 32)
    println(ndg.name)
    ndg.name = "기리"
    println(ndg.name)

    val emma = User(age = 29, name = "김성은")
    println(emma.age)
    println(emma.name)

    val money = Money(BigDecimal(50000), Currency.KRW)
    println(money)
}
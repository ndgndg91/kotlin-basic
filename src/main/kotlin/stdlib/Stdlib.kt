package stdlib

import java.math.BigDecimal

data class Human(var name: String, val age: Int)

data class Money(var value: BigDecimal, val currency: Currency)

enum class Currency {
    KRW,
    USD
}

/**
 * let, with, run, apply, also 선언 형태나 사용법이 거의 유사하다.
 * 목적도 코드를 좀 더 간결하게 하기 위한 것으로 동일하다.
 *
 * let              run              with            apply           also
 * it               this             this            this            it
 * 람다식 반환값       람다식 반환값        람다식 반환값      자기 자신         자기 자신
 */
fun exampleOfStdlib() {
    exampleOfLet()
    exampleOfWith()
    exampleOfRun()
    exampleOfApply()
    exampleOfAlso()
}


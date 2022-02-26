package collections

import java.time.LocalDate

fun exampleOfTypeErasure() {
    val list = listOf("a", LocalDate.now(), 3, 1, 4, "b")
    val strings = list.filter { it is String } // List<Any> 로 추론됨.

    for (s in strings) {
//        s.length // 컴파일 되지 않음 타입이 삭제됨.
    }
}

fun exampleOfSpecificType() {
    val list = listOf("a", LocalDate.now(), 3, 1, 4, "b")

    val all = list.filterIsInstance<Any>()
    val strings = list.filterIsInstance<String>()
    val ints = list.filterIsInstance<Int>()
    val dates = list.filterIsInstance(LocalDate::class.java)

    println(all)
    println(strings)
    println(ints)
    println(dates)
}

fun exampleOfFilterIsInstanceTo() {
    val list = listOf("a", LocalDate.now(), 3, 1, 4, "b")

    val all = list.filterIsInstanceTo(mutableListOf<Any>())
    val strings = list.filterIsInstanceTo(mutableListOf<String>())
    val ints = list.filterIsInstanceTo(mutableListOf<Int>())
    val dates = list.filterIsInstanceTo(mutableListOf<LocalDate>())

    println(all)
    println(strings)
    println(ints)
    println(dates)
}
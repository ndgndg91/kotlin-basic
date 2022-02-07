package generic

import java.util.NoSuchElementException

data class Box<T>(val t: T)

fun exampleOfGeneric() {
    val ten = Box(10)
    val name = Box("남동길")

    println(ten)
    println(name)

    println("head is ${head(listOf(1,2,3))}")
    println("head is ${head(listOf("oen", "two"))}")
}

fun <T> head(list: List<T>): T {
    if (list.isEmpty()) {
        throw NoSuchElementException()
    }

    return list[0]
}
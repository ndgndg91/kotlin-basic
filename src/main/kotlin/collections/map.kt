package collections

fun exampleOfMap() {
    val map1 = mapOf(1 to "One", 2 to "Two")
    val map2 = map1.plus(Pair(3, "Three"))

    println(map1)
    println(map2)

    val mutableMap = mutableMapOf(1 to "One", 2 to "Two")
    mutableMap[3] = "Three"

    println(mutableMap)

    mutableMap.clear()

    println(mutableMap)
}
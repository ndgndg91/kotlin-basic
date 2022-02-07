package collections

fun exampleOfList() {
    val list: List<Int> = listOf(1,2,3,4,5) // 기본적으로 Immutable
    println(list) // 1,2,3,4,5
    list.plus(6)
    println(list) // 1,2,3,4,5
    val newList = list.plus(6) // 새로운 list 반환
    println(newList) // 1,2,3,4,5,6

    val mutableList: MutableList<Int> = mutableListOf(1,2,3,4,5)
    mutableList.add(5)
    println(mutableList)
}
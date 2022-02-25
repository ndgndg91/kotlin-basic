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

    val toList = mutableList.toList() // 읽기 전용 뷰 생성
    println(toList)
}

// collection 이 빈 경우 기본값 리턴하기ㅇ
fun exampleOfItems() {
    val vans = Item("Vans-슬립옵", 25_000.0, false)
    val blackT = Item("Black-T", 15_000.0, false)
    val stop = Item("Stop", 1_000.0, false)

    val items = listOf(vans, blackT, stop)
    val onSaleItemsIfEmptyCollection = onSaleItemsIfEmptyCollection(items)
    val onSaleItemsIfEmptyString = onSaleItemsIfEmptyString(items)

    println(onSaleItemsIfEmptyCollection)
    println(onSaleItemsIfEmptyString)
}

data class Item(val name: String, var price: Double, var onSale: Boolean = false)

private fun onSaleItemsIfEmptyCollection(items: List<Item>) = items
    .filter { it.onSale }
    .ifEmpty { listOf("none") }
    .joinToString(separator = ", ")

private fun onSaleItemsIfEmptyString(items: List<Item>) = items
    .filter { it.onSale }
    .joinToString(separator = ", ") { it.name }
    .ifEmpty { "none" }

fun exampleOfListDestructuring() {
    val list = listOf(1,2,3,4,5,6,7)
    val (a,b,c,d,e) = list
    // list.component1()
    // list.component2()
    // list.component3()
    // list.component4()
    // list.component5()
    println("$a $b $c $d $e")
}

data class Golfer(val score: Int, val first: String, val last: String)

fun exampleOfSortedList() {
    val golfers = listOf(
        Golfer(70, "동길", "남"),
        Golfer(68, "철수", "김"),
        Golfer(68, "영희", "김"),
        Golfer(70, "아무개", "이"),
        Golfer(68, "청이", "심"),
    )

    val sorted = golfers.sortedWith(
        compareBy({it.score}, {it.last}, {it.first})
    )

    println(sorted)

    val comparator = compareBy(Golfer::score)
        .thenBy(Golfer::last)
        .thenBy(Golfer::first)

    val sortedSecond = golfers.sortedWith(comparator)

    println(sortedSecond)
}

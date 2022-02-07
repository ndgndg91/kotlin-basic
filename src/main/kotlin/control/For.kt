package control

fun inClause() {
    for (i in 1..3) {
        print("$i \t")
    }
}

fun downToClause() {
    for (i in 6 downTo 0 step 2) {
        print("$i \t")
    }
}

fun withListOf() {
    val fruits = listOf("apple", "banana", "mango")
    for (item in fruits) {
        print("$item \t")
    }

    for ((index, item) in fruits.withIndex()) {
        print("($index : $item) \t")
    }
}

fun forExample() {
    inClause()
    println()
    downToClause()
    println()
    withListOf()
    println()
}
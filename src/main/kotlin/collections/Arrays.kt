package collections

fun exampleOfArrays() {
    val arrayOf = arrayOf("this", "is", "an", "array", "of", "strings")
    val arrayOfNulls = arrayOfNulls<String>(5)
    val square = Array(5) { i -> (i * i).toString() }

    printArrays(arrayOf)
    printArrays(arrayOfNulls)
    printArrays(square)
}

fun <T> printArrays(array: Array<T>) {
    for (value in array) {
        print("$value \t")
    }
    println()
}
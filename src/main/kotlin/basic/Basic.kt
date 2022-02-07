package basic

fun exampleOfBasic() {
    mutableAndImmutable()
    nonnullAndNullable()
    intToLong()
    binaryString()
}

fun helloWorld(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

private fun mutableAndImmutable() {
    val value: Int = 10
    var mutableValue: Int = 20;

    println("mutable value is : $mutableValue")
    println("mutable value is : ${++mutableValue}")

    println("immutable value is : $value")
}

private fun nonnullAndNullable() {
    val nonNullValue: String = "nonNull"
    val nullableValue: String? = null

    println("non null value : $nonNullValue")
    println("nullable value : $nullableValue")
}

private fun intToLong() {
    val value = 100
    val longValue: Long = value.toLong()
    val newIntValue: Int = longValue.toInt()
    val newLongValue: Long = 300L + value
    println("$value, $longValue, $newIntValue, $newLongValue")
}

private fun binaryString() {
    val value = 32
    val binary32 = value.toString(2)
    val longValue: Long = 128L
    val binary128 = longValue.toString(2)
    println("$value is $binary32")
    println("$longValue is $binary128")
}
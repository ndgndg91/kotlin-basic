package basic

fun exampleOfBasic() {
    mutableAndImmutable()
    nonnullAndNullable()
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
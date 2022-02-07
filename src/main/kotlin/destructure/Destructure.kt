package destructure

data class Language(var name: String, val number: Int)

fun exampleOfDestructure(){
    val student = Language("Java", 32)

    val (name, number) = student

    println("name : $name")
    println("age : $number")

    val languages = listOf(Language("Python", 100), Language("Rust", 1), Language("Kotlin", 50))
    for ((name, number) in languages) {
        println("name : $name, number : $number")
    }

    val map = mapOf("kotlin" to 1)
    for ((name, order) in map) {
        println("name : $name, order : $order")
    }
}
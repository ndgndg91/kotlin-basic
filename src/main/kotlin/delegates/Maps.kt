package delegates

data class Project(val map: MutableMap<String, Any?>) {
    val name: String by map
    var priority: Int by map
    var completed: Boolean by map
}

/**
 * 여러 값이 들어 있는 map 을 제공해 객체를 초기화하고 싶다.
 * Json -> Map -> Object 파싱시 유용하다.
 */
fun exampleOfMapDelegate() {
    val project = Project(
        mutableMapOf(
            "name" to "Learn Kotlin",
            "priority" to 1,
            "completed" to true
        )
    )

    println(project)
}
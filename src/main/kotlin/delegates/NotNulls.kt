package delegates

import kotlin.properties.Delegates

/**
 * 처음 접근이 일어나기 전에 값이 초기화되지 않았다면 예외를 던지고 싶다.
 */
var shouldNotBeNull: String by Delegates.notNull()
fun exampleOfNotNull() {
//    println(shouldNotBeNull) // IllegalStateException : Property shouldNotBeNull should be initialized before get.
    shouldNotBeNull = "Hello Delegates"
    println(shouldNotBeNull)
}
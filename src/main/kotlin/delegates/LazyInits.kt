package delegates

/**
 * 어떤 속성이 필요할 때까지 해당 속성의 초기화를 지연시키고 싶다.
 * lazy 대리자를 사용하자.
 */
fun exampleOfLazy() {
    val ultimateAnswer: Int by lazy {
        println("computing the answer")
        42
    }

    println(ultimateAnswer)
    println(ultimateAnswer)
}
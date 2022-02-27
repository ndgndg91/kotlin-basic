package additionals

/**
 * 주어진 람다식을 여러번 실행하고 싶다.
 * 코틀랜 내장 repeat 함수를 사용한다.
 */
fun exampleOfRepeat() {
    repeat(5) {
        println("Counting: $it")
    }
}
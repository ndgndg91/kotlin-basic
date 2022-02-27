package additionals

/**
 * 숫자를 바이너리 문자열로 변환하거나 바이너리 문자열을 정수로 파싱하고 싶다.
 * radix 를 인자로 받는 toString 또는 toInt 함수 중복을 사용한다.
 */
fun exampleOfRadix() {
    42.toString(radix = 2).also { println(it) }
    "101010".toInt(radix = 2).also { println(it) }
    (0..15).map { it.toString(2).padStart(4, '0') }.also { println(it) }
        .map { it.toInt(2) }.also { println(it) }
}
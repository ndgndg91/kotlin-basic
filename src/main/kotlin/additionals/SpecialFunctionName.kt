package additionals

/**
 * 함수 이름을 읽기 쉽게 작성하고 싶다.
 * 밑줄을 사용하거나 함수 이름을 백틱으로 감싸 읽기 쉽게 만들 수 있다. 하지만 이 기법은 테스트에서만 사용하자.
 */
fun exampleOfSpecialFunctionName() {
    `only use backticks on test function`()
    underscores_are_also_okay_only_on_tests()
}

fun `only use backticks on test function`() {
    println("작동하지만 좋은 방법은 아니다.")
}

fun underscores_are_also_okay_only_on_tests() {
    println("_ 를 이용할 수 있다. test 에서만 사용하자.")
}

package additionals

import kotlin.random.Random
import kotlin.random.nextInt

/**
 * 난수를 생성하고 싶다.
 * Random 클래스에 있는 함수 중 하나를 사용한다.
 */
fun exampleOfRandom() {
    case1()
    case2()
    case3()
    case4()
    case5()
}

private fun case1() {
    val value = Random.nextInt()
    val contains = value in Int.MIN_VALUE..Int.MAX_VALUE
    println("$value in ${Int.MIN_VALUE} ~ ${Int.MAX_VALUE} : $contains")
}

private fun case2() {
    val value = Random.nextInt(10)
    val contains = value in 0..10
    println("$value in 0 ~ 10 : $contains")
}

private fun case3() {
    val value = Random.nextInt(5, 10)
    val contains = value in 5..10
    println("$value in 5 ~ 10 : $contains")
}

private fun case4() {
    val value = Random.nextInt(7..12)
    val contains = value in 7..12
    println("$value in 7 ~ 12 : $contains")
}

/**
 * seed 가 같으면 발생하는 숫자도 같다.
 */
private fun case5() {
    val r1 = Random(12345)
    val nums1 = (1..10).map { r1.nextInt() }

    val r2 = Random(12345)
    val nums2 = (1..10).map { r2.nextInt() }

    println("$nums1 == $nums2 : ${nums1 == nums2}")
}
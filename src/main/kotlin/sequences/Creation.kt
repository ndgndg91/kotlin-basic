package sequences

import kotlin.math.ceil
import kotlin.math.sqrt

fun exampleOfCreation() {
    val sequenceOf = sequenceOf(3, 1, 4, 5, 1, 2)
    val asSequence = listOf(3, 1, 4, 2, 65).asSequence()

    val firstPrime = sequenceOf.filter { it.isPrime() }.first()
    println("$firstPrime")

    println("6 next prime is ${nextPrime(6)}")
    println("9973 next prime is ${nextPrime(9973)}")

    println("100개 의 소수 : ${firstNPrimes(100)}")

    println(primesLessThan(10))
    println(otherPrimesLessThan(10))
}

fun Int.isPrime() = this == 2 || (2..ceil(sqrt(this.toDouble())).toInt()).none { divisor -> this % divisor == 0 }

fun nextPrime(num: Int) = generateSequence(num + 1) { it + 1 }.first(Int::isPrime)

// take 는 중간 연산
// toList 최종 연산
fun firstNPrimes(count: Int) = generateSequence(2, ::nextPrime).take(count).toList()

fun primesLessThan(max: Int): List<Int> = generateSequence(2) { n -> println("n = $n");if (n < max) nextPrime(n) else null }
    .toList()
    .dropLast(1)

fun otherPrimesLessThan(max: Int): List<Int> = generateSequence(2, ::nextPrime)
    .takeWhile { it < max }
    .toList()
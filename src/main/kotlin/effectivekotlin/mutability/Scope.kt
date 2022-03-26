package effectivekotlin.mutability

private fun prime() {
    var numbers = (2..100).toList()
    val primes = mutableListOf<Int>()
    while (numbers.isNotEmpty()) {
        val prime = numbers.first()
        primes.add(prime)
        numbers = numbers.filter { it % prime != 0 }
    }
    print(primes)
}

private fun prime2() {
    val primes: Sequence<Int> = sequence {
        var numbers = generateSequence(2) { it + 1 }

        while (true) {
            val prime = numbers.first()
            yield(prime)
            numbers = numbers.drop(1).filter { it % prime != 0 }
        }
    }

    val iterator = primes.iterator()
    for (i in 0..10) {
        println(iterator.next())
    }

}
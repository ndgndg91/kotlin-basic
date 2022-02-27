package additionals

import java.util.stream.IntStream
import kotlin.system.measureTimeMillis

/**
 * 코드 블록이 실행되는 데 걸린 시간을 알고싶다.
 * 코틀린 표준 라이브러리의 measureTimeMillis 또는 measureNanoTime 함수를 사용한다.
 */
fun exampleOfMeasureTime() {
    println("${Runtime.getRuntime().availableProcessors()} processors")
    var time = measureTimeMillis {
        IntStream.rangeClosed(1, 12)
            .map{ doubleIt(it)}
            .sum()
    }

    println("Sequential stream took ${time}ms")

    time = measureTimeMillis {
        IntStream.rangeClosed(1, 12)
            .parallel()
            .map{ doubleIt(it)}
            .sum()
    }

    println("Parallel stream took ${time}ms")
}

fun doubleIt(x: Int): Int {
    Thread.sleep(100L)
    println("doubling $x with on thread ${Thread.currentThread().name}")
    return x * 2
}


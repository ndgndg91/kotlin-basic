package sequences

/**
 * collection 에서 처리는 eager 처리한다.
 * map, filter etc
 * 각 파이프라인마다 모든 원소가 단계적으로 처리되고 넘어간다.
 *
 * sequence 는 lazy 처리한다. 즉 원소 하나씩 모든 파이프라인에 처리된다.
 * first 0 - 쇼프 서킷
 */

// map 100 번 계산
// filter 100 번 계산
fun exampleOfEager() {
    var mapCount = 0
    var filterCount = 0
    val first = (100 until 200).map {
        mapCount++
        it * 2
    }.filter {
        filterCount++
        it % 3 == 0
    }.first()

    println("$mapCount $filterCount $first")
}

// map 100 번 계산
// first 에서 3개만 계산
fun exampleOfEagerBetter() {
    var mapCount = 0
    val first = (100 until 200).map {
        mapCount++
        it * 2
    }.first {it % 3 == 0}

    println("$mapCount $first")
}

// 오직 6개의 연산만 함
// 중간 연산 - intermediate operation (map, filter)
// 최종 연산 - terminal operation (first)
// 최종 연산을 호출하는 경우에만 시퀀스가 데이터를 처리한다.
fun exampleOfOptimise() {
    var mapCount = 0
    var filterCount = 0
    val first = (100 until 20_000).asSequence()
        .map { mapCount++; it * 2 }
        .filter { filterCount++; it % 3 == 0 }
        .first()

    println("$mapCount $filterCount $first")
}

// 최종 연산을 호출하지 않아서 시퀀스가 데이터를 처리하지 않음
fun exampleOfBadSequence() {
    var mapCount = 0
    var filterCount = 0
    val first = (100 until 20_000).asSequence()
        .map { mapCount++; it * 2 }
        .filter { filterCount++; it % 3 == 0 }

    println("$mapCount $filterCount $first")
}

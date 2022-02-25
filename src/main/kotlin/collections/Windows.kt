package collections


fun exampleOfChunked() {
    val range = 0..10

    val chunked = range.chunked(3)
    println(chunked) // [0,1,2] [3,4,5] [6,7,8] [9,10]

    val chunkedSum = range.chunked(3) { it.sum() }
    println(chunkedSum) // 3, 12, 21, 19

    val chunkedAverage = range.chunked(3) { it.average() }
    println(chunkedAverage) // 1.0, 4.0, 7.0, 9.5
}

// 시계열 데이터를 단계별로 처리하기 유용하다.
fun exampleOfWindowed() {
    val range = 0..10

    val windowed = range.windowed(3, 3)
    println(windowed) // [0,1,2], [3,4,5] [6,7,8]

    val windowedSum = range.windowed(3, 3) { it.sum() }
    println(windowedSum)

    val windowedAverage = range.windowed(3, 3) { it.average() }
    println(windowedAverage)

    val windowedSize3Step1 = range.windowed(3, 1)
    println(windowedSize3Step1)
}
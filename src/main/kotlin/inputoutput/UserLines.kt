package inputoutput

import java.io.File

/**
 * 파일 같은 리소스를 처리하고 사용을 끝마쳤을 때 확실하게 리소스를 닫고 싶지만 코틀린은 자바의 try-with-resources 구문을 지원하지 않는다.
 * kotlin.io 패키지의 use 또는 java.io.Reader 의 useLines 확장 함수를 사용한다.
 */
fun exampleOfUseLines() {
    val useLines = File("words.txt").useLines { line ->
        line.filter { it.length > 10 }.sortedByDescending(String::length).take(10).toList()
    }

    useLines.forEach {
        word -> println("$word(${word.length})")
    }
}
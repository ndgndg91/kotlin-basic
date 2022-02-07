package stdlib

import java.io.FileInputStream
import java.util.*

fun exampleOfUse() {
    val property = Properties()
    FileInputStream("config.properties").use {
        property.load(it)
    } // FileInputStream 이 자동으로 close 됨. java 의 try-with-resource 와 같음.
}
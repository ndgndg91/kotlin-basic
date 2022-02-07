import basic.helloWorld
import basic.mutableAndImmutable
import basic.nonnullAndNullable
import basic.unitEqualVoidInJava
import classInKotlin.exampleClass
import classInKotlin.exampleSealedClass
import control.forExample
import func.*
import interfaceInKotlin.exampleInterface

fun main(args: Array<String>) {
    helloWorld(args)
    mutableAndImmutable()
    nonnullAndNullable()
    unitEqualVoidInJava()

    val four = twice1(2)
    val sixteen = twice2(4)
    val twentyFive = twice3(5)

    println("$four $sixteen $twentyFive")

    println("${add1(1, 1) + add2(2, 2,) + add3(3, 3)}")
    println("${addWithDefaultValue(5)}")
    println("${addWithDefaultValue(5, 5)}")
    println("${addWithDefaultValue(x = 7)}")
    println("${addWithDefaultValue(y = 9)}")
    println("${addWithDefaultValue()}")

    extensionFuncExample()
    anonymousFunctionExample()
    forExample()
    exampleInterface()
    exampleClass()
    exampleSealedClass()
}




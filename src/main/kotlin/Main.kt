import basic.*
import classInKotlin.exampleClass
import classInKotlin.exampleSealedClass
import collections.*
import control.forExample
import control.patternMatchingExample
import destructure.exampleOfDestructure
import func.*
import generic.exampleOfGeneric
import interfaceInKotlin.exampleInterface
import recursion.exampleRecursiveMaximumInList
import recursion.fibonacciRecursive
import sequences.*
import stdlib.exampleOfAlso
import stdlib.exampleOfApply
import stdlib.exampleOfStdlib

fun main(args: Array<String>) {
//    basic(args)
//    recursion()
    exampleOfCreation()
}

private fun recursion() {
    println(fibonacciRecursive(10))
    exampleRecursiveMaximumInList()
}

private fun basic(args: Array<String>) {
    helloWorld(args)
    exampleOfBasic()
    unitEqualVoidInJava()

    val four = twice1(2)
    val sixteen = twice2(4)
    val twentyFive = twice3(5)

    println("$four $sixteen $twentyFive")

    println("${add1(1, 1) + add2(2, 2) + add3(3, 3)}")
    println("${addWithDefaultValue(5)}")
    println("${addWithDefaultValue(5, 5)}")
    println("${addWithDefaultValue(x = 7)}")
    println("${addWithDefaultValue(y = 9)}")
    println("${addWithDefaultValue()}")

    patternMatchingExample()
    extensionFuncExample()
    anonymousFunctionExample()
    forExample()
    exampleInterface()
    exampleClass()
    exampleSealedClass()
    exampleOfDestructure()

    exampleOfList()
    exampleOfMap()
    exampleOfGeneric()
    exampleOfStdlib()
    exampleOfApply()
    exampleOfAlso()

    exampleOfArrays()
    exampleOfItems()

    exampleOfCoerceIn()
    exampleOfChunked()
    exampleOfWindowed()
    exampleOfListDestructuring()
    exampleOfSortedList()
    exampleOfIterators()
    exampleOfSpecificType()
    exampleOfFilterIsInstanceTo()

    exampleOfEager()
    exampleOfEagerBetter()
    exampleOfOptimise()
    exampleOfBadSequence()
}

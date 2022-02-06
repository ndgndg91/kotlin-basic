import basic.helloWorld
import basic.mutableAndImmutable
import basic.nonnullAndNullable
import func.twice1
import func.twice2
import func.twice3

fun main(args: Array<String>) {
    helloWorld(args)
    mutableAndImmutable()
    nonnullAndNullable()

    val four = twice1(2)
    val sixteen = twice2(4)
    val twentyFive = twice3(5)

    println("$four $sixteen $twentyFive")
}




package interfaceInKotlin

interface Foo {
    val foo: Int
    fun printFoo() {
        println("Foo")
    }

    fun printMultipleImplement() {
        println("Foo MultipleImplement")
    }
}

interface Bar {
    val bar: Int // 추상 프로퍼티
    fun printBar() {
        println("Bar")
    }

    fun printMultipleImplement() {
        println("Bar MultipleImplement")
    }
}

class MultipleImplement : Foo, Bar {
    override val bar: Int get() = 3
    override val foo: Int get() = 5
    override fun printBar() {
        println("bar in MultipleImplement")
    }

    override fun printFoo() {
        println("foo in MultipleImplement")
    }

    override fun printMultipleImplement() {
        super<Foo>.printMultipleImplement()
        super<Bar>.printMultipleImplement()
    }
}

fun exampleInterface() {
    val multipleImplement = MultipleImplement()
    multipleImplement.printBar()
    multipleImplement.printFoo()
    multipleImplement.printMultipleImplement()
    println(multipleImplement.bar)
    println(multipleImplement.foo)
}
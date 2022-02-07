package stdlib

fun exampleOfRun() {
    println("======exampleOfRun=======")
    val human = Human("남동길", 32)
    val result = human.run {
        this.name = "동길"
        this
    }.run {
        this.name = "기리"
        this
    }

    println("human == result : ${human == result}" )
    println("human === result : ${human === result}" )

    val emma = run {
        val name = "emma"
        val age = 29
        Human(name, age)
    }

    println(emma)
}
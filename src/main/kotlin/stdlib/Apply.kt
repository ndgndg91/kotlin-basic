package stdlib

fun exampleOfApply() {
    println("=======exampleOfApply=======")
    val human = Human("남동길", 32)
    println(human)
    val apply = human.apply {
        this.name = "동길"
    }

    println("human === apply : ${human === apply}")
    println("human == apply : ${human == apply}")
}


package stdlib

/**
 * 객체를 사용하기 전에 생성자 인자만으로는 할 수 없는 초기화 작업이 필요할 경우.
 * ex) RDBMS INSERT 후 생성된 PK 를 객체에 주입.
 */
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


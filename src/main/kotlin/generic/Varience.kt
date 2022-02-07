package generic

/**
 * languageBox, jvmBox, kotlinBox 사이에는 상속 관계가 존재하지 않는다.
 * 따라서 무공변이다.
 */
fun exampleOfInvariant() {
    val languageBox = Box(Language())
    val jvmBox = Box(JVM())
    val kotlinBox = Box(Kotlin())

//    invariant(languageBox) // compile error
    invariant(jvmBox)
//    invariant(kotlinBox) // compile error
}

fun invariant(value: Box<JVM>) {}

/**
 * out 을 통해서 JVM 을 포함안 하위 타입을 허용
 */
fun exampleOfCovariant() {
    val languageBox = Box(Language())
    val jvmBox = Box(JVM())
    val kotlinBox = Box(Kotlin())

//    covariant(languageBox) // compile error
    covariant(jvmBox)
    covariant(kotlinBox)

//    upperBound(languageBox) // compile error
    upperBound(jvmBox)
    upperBound(kotlinBox)
}

fun covariant(value: Box<out JVM>) {}
fun <T : JVM> upperBound(value: Box<T>) {}

/**
 * in 을 통해서 JVM 상위 타입을 허용
 */
fun exampleOfContravariant() {
    val languageBox = Box(Language())
    val jvmBox = Box(JVM())
    val kotlinBox = Box(Kotlin())

    contravariant(languageBox)
    contravariant(jvmBox)
//    contravariant(kotlinBox) // compile error
}

fun contravariant(value : Box<in JVM>) {}

interface Box2<out T> {
    fun read(): T
//    fun write(value: T) // compile error
}

interface Box3<in T> {
//    fun read(): T // compile error
    fun write(value: T)
}
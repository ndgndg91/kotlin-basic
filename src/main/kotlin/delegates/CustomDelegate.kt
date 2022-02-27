package delegates

import kotlin.reflect.KProperty

/**
 * 어떤 클래스의 속성이 다른 클래스의 획득자와 설정자를 사용하게끔 만들고 싶다.
 * ReadOnlyProperty 또는 ReadWriteProperty 를 구현하는 클래스를 생성함으로써 직접 속성 대리자를 작성한다.
 */
fun exampleOfCustomDelegate() {
    val e = Example()
    println(e.p)
    e.p = "NEW"
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}` in $thisRef")
    }
}

class Example {
    var p: String by Delegate()
}
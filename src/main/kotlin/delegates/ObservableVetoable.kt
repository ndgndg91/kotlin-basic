package delegates

import kotlin.properties.Delegates

/**
 * 속성의 변경을 가로채서, 필요에 따라 변경을 거부하고 싶다.
 */
var watched: Int by Delegates.observable(1) { property, oldValue, newValue ->
    println("${property.name} changed from $oldValue to $newValue")
}

var checked: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
    println("Trying to change ${property.name} from $oldValue to $newValue")
    newValue >= 0
}

fun exampleOfObservableVetoable() {
    println(watched)
    watched *= 2
    println(watched)
    watched *= 2
    println(watched)

    println()

    println(checked)
    checked = 42
    println(checked)
    checked = -1 // 변경되지 않음
    println(checked) // 42
}
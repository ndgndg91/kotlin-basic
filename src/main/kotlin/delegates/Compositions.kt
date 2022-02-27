package delegates

interface Dialable {
    fun dial(number: String): String
}

class Phone: Dialable {
    override fun dial(number: String): String {
        return "Dialing $number"
    }
}

interface Snappable {
    fun takePicture(): String
}

class Camera: Snappable {
    override fun takePicture(): String {
        return "Taking picture..."
    }
}

class SmartPhone(
    private val phone: Dialable = Phone(),
    private val camera: Snappable = Camera()
) : Dialable by phone, Snappable by camera

/**
 * phone, camera 객체는 노출되지 않고 오직 public function 만 client 에 노출된다.
 * 노출된 function 을 통해서 위임한다.
 */
fun exampleOfComposition() {
    val smartPhone = SmartPhone()

    println(smartPhone.dial("01072255198"))
    println(smartPhone.takePicture())
}
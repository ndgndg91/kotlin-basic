package effectivekotlin.exception

/**
 * require 와 check 블록으로 어떤 조건을 확인해서 true 가 나왔다면, 해당 조건은 이후로도 true 일 거라고 가정합니다.
 */


open class Outfit
class Dress: Outfit()
data class Person(val outfit: Outfit, val email: String)
fun validateEmail(email: String) {}

@Throws(IllegalArgumentException::class)
fun changeDress(person: Person){
    require(person.outfit is Dress) {"person outfit type must be Dress"}
    val dress: Dress  = person.outfit
    TODO("change dress")
}

@Throws(IllegalArgumentException::class)
fun sendEmail(person: Person, message: String) {
    val email: String = requireNotNull(person.email) {"person email must not be null"}
//    val email: String = person.email?: return // 함수 종료하는 방법 elvis
//    val email: String = person.email ?: run { // run {} 을 통해 로그를 남기고 종료
//        println("Email not sent, no email address")
//        return
//    }
    validateEmail(email)
    TODO("send email using message")
}





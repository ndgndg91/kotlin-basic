package additionals

import com.google.gson.Gson
import java.net.URL

/**
 * 클래스에서 단일 함수를 간단하게 호출하고 싶다.
 * 함수를 호출할 클래스에서 invoke 연산자 함수를 재정의한다.
 */
fun exampleOfRunnableClass() {
    val request = AstroRequest()
    val result = request() // 함수처럼 클래스를 호출 invoke() 메서드가 호출됨.
    println(result)
}

class AstroRequest {
    companion object {
        private const val ASTRO_URL = "http://api.open-notify.org/astros.json"
    }

    operator fun invoke(): AstroResult {
        val responseString = URL(ASTRO_URL).readText()
        return Gson().fromJson(responseString, AstroResult::class.java)
    }
}

data class AstroResult(val message: String, val number: Number, val people: List<Assignment>) {}

data class Assignment(val craft: String, val name: String) {}

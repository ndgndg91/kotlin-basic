package additionals

/**
 * 부분 문자열(substring) 의 모든 인스턴스를 어떤 값으로 교체하고 싶다.
 * 문자열 인자 또는 정규식을 받도록 중복된 String 의 replace 함수를 사용한다.
 */
fun exampleOfReplaceRegex() {
    println("replace 'one*two*' : ${"one*two*".replace("*", ".")}")
    println("replace 'one*two* : ${"one*two*".replace(".".toRegex(), "*")}")

    println(isPalindrome("aba"))
    println(isPalindrome("ddddadddd"))
}

fun isPalindrome(str: String) = str.lowercase().replace("""[\W+]""".toRegex(), "").let { it == it.reversed() }


package Chap06.section7

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)

    val user = User("Kildong", "default")

    val result = with (user) {
        skills = "Kotlin"
        email = "kildong@example.com"
        "배고파?"  // 마지막 표현식이 반환됨
    }
    println(user)
    println("result: $result")
}
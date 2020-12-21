package Chap02.section2

fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    // ===는 참조까지 비교하는 연산자
    println("str1 === str2 ${str1 === str2}")
    println("str1 === str3 ${str1 === str3}")
}
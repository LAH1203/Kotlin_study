package Chap02.section3

fun main() {
    var str1: String
    // str1 = null
    str1 = "Hello"
    // val len1 = if(str1 != null) str1.length else -1
    val len1 = str1?.length ?: -1
    // println("str1: $str1, length: ${str1.length}")
    println("str1: $str1, length: $len1")

    var str2: String?
    str2 = null
    val len2 = if (str2 != null) str2.length else -1
    // println("str2: $str2, length: ${str2?.length}")
    println("str2: $str2, length: $len2")
}
package Chap02.section3

fun main() {
    val a: Int = 128
    val b: Int = a
    val c: Int? = a

    println(a == b)
    println(a === b)
    println(a == c)
    println(a === c)
}
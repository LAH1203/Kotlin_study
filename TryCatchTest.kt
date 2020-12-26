package Chap05.section4

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b
        println("After")    // exception이 발생했으므로 실행되지 않는 문장
    } catch (e: Exception) {
        // ArithmeticException(divide by zero)
        println("Exception 발생. ${e.message}")
        e.printStackTrace()
    } finally {
        println("Finally는 항상 실행됨")
    }
}
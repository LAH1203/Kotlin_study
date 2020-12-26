package Chap05.section3

fun main() {
    for (i in 1..5) {
        // if (i == 3) break
        if (i == 3) continue
        print(i)
    }
    println()   // 개행 문자
    println("outside")
}
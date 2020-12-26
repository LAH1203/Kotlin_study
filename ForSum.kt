package Chap05.section2

fun main() {
    var sum = 0

    // 홀수 합
    for (x in 1..100 step 2) sum += x
    println("홀수 합: $sum")

    sum = 0
    // 짝수 합
    for (x in 2..100 step 2) sum += x
    println("짝수 합: $sum")
}
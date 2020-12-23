package Chap03.section1

fun main() {    // 최상위 (Top-level) 함수

    /* sum 지역 함수 version
    fun sum(a: Int, b: Int): Int {  // 최상위 함수
        return a + b
    }
    */

    val result1 = sum(2, 3)
    println(result1)

    val a = 3
    val b = 5
    val result2 = max(a, b)
    println(result2)

    outfunc("Ahhyun")

    val result3 = sum(2)
    println(result3)
}

// main 함수 내에 sum 함수를 넣을 수도 있다.
fun sum(a: Int, b: Int = 5): Int {  // 최상위 함수
    return a + b
}
// fun sum(a: Int, b: Int): Int = a + b
// fun sum(a: Int, b: Int) = a + b <= a+b가 Int형으로 추론 가능한 경우 생략 가능

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}
// fun max(a: Int, b: Int) = if (a > b) a else b

fun outfunc(name: String): Unit {
    println("Name: $name")
    // return Unit
}
// fun outfunc(name: String) = println("Name: $name")
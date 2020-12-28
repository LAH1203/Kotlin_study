package Chap06.section2

fun main() {
    val calc = Calc()
    var result = 0  // 외부 변수
    calc.addNum(2, 3) { x, y -> result = x + y }    // 클로저
    println(result) // 값이 유지되어 5가 출력
}
class Calc {
    fun addNum(a: Int, b: Int, add: (Int, Int) -> Unit) {   // 람다식 add에는 반환값이 없음
        add(a, b)
    }
}
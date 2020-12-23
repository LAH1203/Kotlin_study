package Chap04.section1

fun main() {
    val result: Int

    // val multi = {x: Int, y: Int -> x * y}
    val multi: (x: Int, y: Int) -> Int = {x, y ->
        println("x: $x, y: $y")
        x * y
    }

    // 람다식 안에 람다식이 있는 경우우
   val nestedLambda: () -> () -> Unit = { { println("nestedLambda") } }

    result = multi(10, 20)
    println(result)
}
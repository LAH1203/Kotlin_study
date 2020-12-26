package Chap05.section3

fun main() {
    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

//fun retFunc() {
//    println("start of retFunc")
//    inlineLambda(13, 3) { a, b ->
//        val result = a + b
//        if (result > 10) return // retFunc 종료
//        println("result: $result")  // result가 10보다 크면 이 문장에 도달하지 못함
//    }
//    println("end of retFunc")   // result가 10보다 크면 이 문장에 도달하지 못함
//}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3) lit@{ a, b ->
        val result = a + b
        if (result > 10) return@lit // inlineLambda 종료
        println("result: $result")  // result가 10보다 크면 이 문장에 도달하지 못함
    }
    println("end of retFunc")   // 항상 이 문장에 도달함
}
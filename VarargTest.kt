package Chap03.section1

fun normalVarargs(vararg a: Int) {
    for (num in a) {
        println(num)
    }
}

fun main() {
    normalVarargs(1)

    normalVarargs(1, 2, 3, 4)
}
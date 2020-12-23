package Chap04.section4

var global = 10

fun main() {

    // localFunc1()
    fun localFunc1() {
        println("localFucn1")
    }
    localFunc1()

    global = 15
    val local1 = 15
    println("global $global")
    userFunc()
    println("final - global: $global, local1: $local1")
}

fun userFunc() {
    // localFunc1()
    global = 20
    val local1 = 20
    println("userFunc - global: $global, local1: $local1")
}
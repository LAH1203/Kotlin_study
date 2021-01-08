package chap01.section2

class Bird {
    // 프로퍼티
    var name: String
    var wing: Int
    var beak: String

    constructor(name: String, wing: Int, beak: String) {    // 부 생성자
        this.name = name
        this.wing = wing
        this.beak = beak
    }

    constructor(name: String, beak: String) {   // 부 생성자
        this.name = name
        wing = 2
        this.beak = beak
    }

    /*
    init {  // 생성과 동시에 초기화
        println("---------- init start ----------")
        name = name.capitalize()
        println("name = $name")
        wing += 2
        println("wing = $wing")
        beak = "short"
        println("beak = $beak")
        println("----------- init end -----------")
    }
     */

    // 메서드
    fun fly() {
        println("Fly")
    }
}

fun main() {
    val coco = Bird("coco", 2, "long")
    val coco2 = Bird("coco", "long")

    coco.fly()
    println(coco.name)
    println(coco.wing)
    println(coco.beak)

    println("[coco2]\nname: ${coco2.name}, wing: ${coco2.wing}, beak: ${coco2.beak}")

}
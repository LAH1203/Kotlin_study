package Chap06.section6

fun main() {
    // apply와 run 비교
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")

    val returnObj = person.apply {
        name = "Sean"   // == this.name = "Sean"
        skills = "Java" // == this.skills = "Java"
        "success"   // 사용되지 않음
    }
    println(person)
    println("returnObj: $returnObj")

    val returnObj2 = person.run {
        name = "Dooly"  // == this.name = "Dooly"
        skills = "C#"   // == this.skills = "C#"
        "success"
    }
    println(person)
    println("returnObj2: $returnObj2")
}
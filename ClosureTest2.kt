package Chap06.section2

// 길이가 일치하는 이름만 출력하는 함수
fun filteredNames(length: Int) {
    val names = arrayListOf("Kim", "Hong", "Go", "Hwang", "Jeon")
    val filterResult = names.filter {
        it.length == length     // 바깥의 length에 접근
    }
    println(filterResult)
}

fun main() {
    filteredNames(4)
}
package Chap03.section2

/*
예제: 평균 구하기
목표: 하나 이상의 실수를 받아서 모든 실수의 합의 평균을 구하고 출력하려고 한다.
다음 조건을 만족하는 함수를 구현해보자!
1. 초기값을 위한 인자는 Float형
2. 초기값은 두 번째부터 나열된 인자를 최종 평균 결과에 더함
3. 초기값에 아무런 인자를 입력하지 않으면 0을 기본으로 사용
4. 두 번째부터 받아들일 인자는 가변형 인자로 모두 실수형 Float
5. 반환값은 모든 인자의 평균값으로 마찬가지로 실수형 Double
*/

fun avgFunc(initial: Float = 0f, vararg numbers: Float): Double {
    var result = 0f
    for (num in numbers) {
        result += num
    }
    println("result: $result, numbers.size: ${numbers.size}")
    val avg = result / numbers.size + initial
    return avg.toDouble()
}

fun main() {
    val result = avgFunc(5f, 100f, 90f, 80f)
    println("avg result: $result")
}


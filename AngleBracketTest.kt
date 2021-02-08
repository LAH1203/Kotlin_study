package chap01.section4

open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}

// 인터페이스는 기본적으로 open
interface B {
    fun f() = println("B Interface f()")
    fun b() = println("B Interface b()")
}

// 콤마(,)를 사용해 클래스와 인터페이스를 지정
class C : A(), B {
    // 컴파일되려면 f()가 오버라이딩되어야 함
    override fun f() = println("C Class f()")
    fun test() {
        // 현재 클래스의 f()
        f()
        // 인터페이스 B의 b()
        b()
        // A 클래스의 f()
        super<A>.f()
        // B 클래스의 f()
        super<B>.f()
    }
}

fun main() {
    val c = C()
    c.test()
}
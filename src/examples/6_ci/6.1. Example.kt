package ci.example

// classes

open class Parent(p : Bar) {
    open fun foo() {
    }
    fun bar() {
    }
}

class Child(p : Bar) : Parent(p) {
    override fun foo() {
    }
}

//traits

trait T1 : Class1, OtherTrait {
    // no state
}

class Foo(p : Bar) : Class1(p), T1, T2 {
    // ...
}

class Decorator(p : T2) : Class2(), T2 by p {
    // ...
}

// disambiguation

trait A {
    fun foo() : Int = 1 // open by default
}

open class B() {
    open fun foo() : Int = 2 // not open by default
}

class C() : B(), A {
    override fun foo() = super<A>.foo() // returns 1
}

//////

val p = Bar()

open class Bar() {
}

open class Class1(p:Bar) {
}

open class Class2() {
}

trait OtherTrait {
}

trait T2 {
}

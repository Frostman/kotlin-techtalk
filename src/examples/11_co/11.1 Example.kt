package co

class Example() {
    class object {
        fun create() = Example()
    }
}

val e = Example.create()

//

trait Factory<T> {
    fun create() : T
}

class Example2() {
    class object : Factory<Example2> {
        override fun create() = Example2()
    }
}

val factory : Factory<Example2> = Example2
val e2 : Example2 = factory.create()


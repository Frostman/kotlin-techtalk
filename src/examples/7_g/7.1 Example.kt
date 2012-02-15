package g.example

// there now raw-types in Kotlin

class List<T> {
    fun add(t : T)
    fun get(idx : Int) : T
}

val intList = List<Int>()
val anyList : List<Any> = intList // We should not be able to do so
anyList.add("1") // Cause of the problem
val i : Int = intList.get(0) // !!!

class Producer<out T> {
    fun get() : T
}

val intProd = Producer<Int>()
val anyProd : Producer<Any> = intProd

class Consumer<in T> {
    fun add(t : T)
}

val anyCons = Consumer<Any>()
val intCons : Consumer<Int> = anyCons

////
fun a() {


val intList = List<Int>()
val anyListOut : List<out Any> = intList
anyListOut.add("1") // Not available
val i : Int = intList.get(0) // No problem

val anyList = List<Any>()
val intListIn : List<in Int> = anyList
intListIn.add(123)
val obj = intListIn.get(0) // : Any?

}

//

// Type information is retained in runtime
foo is List<T>
Array<T>(10)
T.create()
T.javaClass

// Java types is still erased...
foo is java.util.List<*>

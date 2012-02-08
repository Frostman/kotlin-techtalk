package acw.example

import java.util.ArrayList

fun main(args : Array<String>) {
    foo(ArrayList<Int>());
}

fun foo(obj : Any?) {
    if (obj is String) {
        println(obj.get(0));
    }

    val x : Any? = when (obj) {
        is String -> obj.get(0)    // autocast to String
        is Int -> obj + 1          // autocast to Int
        !is Boolean -> null
        else -> "unknown"
    }
    println(x)

    // guards and types
    val i : Int = when (obj) {
        is String -> if(obj.startsWith("a")) 1 else 0
        is Int -> obj
        else -> -1
    }
    println(i)
}

fun bar(x : Int) {
    val x : Any? = when (x) {
        0 -> "Zero"
        1, 2, 3 -> "1, 2 or 3"
        x + 1 -> "Really strange"
        in 10..100 -> "In range"
        !in 100..1000 -> "Out of range"
    }
}

fun println(any : Any?) {
    System.out?.println(any);
}

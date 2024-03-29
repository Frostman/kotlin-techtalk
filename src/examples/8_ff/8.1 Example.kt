package ff

import java.util.ArrayList
import java.util.HashSet

fun main(args : Array<String>) {
    test(
        { (a : Int) -> a + 1 },
        { (b) : Int -> b * 2 },
        { c -> c.times(2) }
    )
}

fun foo(arg : String) : Boolean {
    return true;
}

fun test( arg1 : (p : Int) -> Int, arg2 : (Int) -> Int, arg3 : (Int)->Int ) {
}

/*
fun <T> filter( c : Iterable<T>, f : (T) -> Boolean) : Iterable<T> {
    return
}
*/

/*
fun foo() {
    val list:Iterable<String> = ArrayList<String>();

    filter(list, { s -> s.length < 3 })

    filter(list) { s -> s.length < 3 }

    filter(list) { it.length < 3 }

}


fun reachable(from : Vertex, to : Vertex) : Boolean {
    val visited = HashSet<Vertex>()

    fun dfs(current : Vertex) {
        // here we return from the outer function:
        if (current == to) return@reachable true

        // And here - from local function:
        if (!visited.add(current)) return

        for (v in current.neighbors)
            dfs(v)
    }

    dfs(from)
    return false // if dfs() did not return true already
}

class Graph() {
    val vertices : Array<Vertex>
}

class Vertex() {
    val neighbors : Iterable<Vertex> =
}
*/

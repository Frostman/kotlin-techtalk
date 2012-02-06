package ns.example

fun main(args : Array<String>) {
    val x = parseInt("123")
    val y = parseInt("Hello")
    //println(x?.times(2))  // Type mismatch: inferred type is Int? but Any was expected
    if (x != null) {
        println(x * 2)
    }
}

fun parseInt(str : String) : Int? {
    try {
        return Integer.parseInt(str)
    } catch (e : NumberFormatException) {
        return null
    }
}

fun println(any : Any) {
    System.out?.println(any);
}

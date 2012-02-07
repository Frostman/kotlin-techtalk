package ns.example

fun main(args : Array<String>) {
    val x = parseInt("1027")
    val y = parseInt("Hello, World!")
    println(x?.times(2))
    // println(x?.times(y))     // y can't be nullable at this pos
    println(x?.times(y.sure())) // throw NPE if y == null
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

fun println(any : Any?) {
    System.out?.println(any);
}

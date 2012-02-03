package tuples.examples

fun main(args : Array<String>) {

    var x = #(1, 2, 3)

    when(x) {
        //is #(*, 2, val c) -> println("c=" + c)  //unsupported yet
        null -> println("null")
        else -> println("Unknown");
    }

    // labeled tuples
    val point : #(x : Int, y : Int) = #(y = 10, x = 5)
//    println(point.x + "")
//    println("${point.x}")

}

fun println(str : String) {
    System.out?.println(str);
}

package tuples.examples

fun main(args : Array<String>) {



}

/*
class Tuple2<out T1, out T2>(
  val _1 : T1,
  val _2 : T2
)

val pair : #(Int, String) = #(1, "")
// same as 'Tuple2<Int, String>(1, "")'

when (x) {
  is #(null, *) => throw NullPointerException()
  is #(val a, val b) => print(a, b)
}

print("left = ${pair._1}, right = ${pair._2}")

//labeled

val point : #(x : Int, y : Int)

print("x = ${point.x}, y = ${point.y}")

val point : #(x : Int, y : Int) = #(y = 10, x = 5)
*/

package pm

/*
when (a) {
    is Tree#(*, null) -> print("no right child")
    is Tree#(val l is Tree, val r is Tree) -> print("two children: $l and $r")
    is Tree -> print("just a tree")
    is #(*, val b in 1..100) -> print(b)
    else -> print("unknown")
}

class Tree(val left : Tree?, val right : Tree?)

decomposer fun Any?.Tree() : #(Tree?, Tree?)? {
    return if (this is Tree) #(this.left, this.right) else null
}

/////
when (d) {
    is mmddyy#(02, 16, val a) -> print("Feb 16th of $a"))
}

class Date(val timestamp : Long) {
  fun mmddyy() : #(Int, Int, Int)? = #(month, day, year)
}

fun Date.mmddyy() : #(Int, Int, Int)? = #(month, day, year)
*/

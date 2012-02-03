package hn.realistic

fun main(args : Array<String>) {
    println("Hello, ${args.join(", ")}!")
}

fun <T> Iterable<T>.join(separator : String) : String {
    val names = StringBuilder()
    forit (this) {
        names += it.next()
        if (it.hasNext)
            names += separator
    }

    return names.toString()?:""
}

fun <T> forit(col : Iterable<T>, f : (Iterator<T>) -> Unit) {
    val it = col.iterator()
    while (it.hasNext) {
        f(it)
    }
}

fun StringBuilder.plusAssign(any : Any) {  // it should be Any because it.next() : <T>
    this.append(any)
}

fun println(str : String) {
    System.out?.println(str);
}

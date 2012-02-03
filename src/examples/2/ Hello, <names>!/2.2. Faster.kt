package hn.fast

fun main(args : Array<String>) {
    var names = StringBuilder(); // names : StringBuilder

    for(idx in args.indices) {
        names += args[idx]
        if(idx + 1 < args.size) {
            names += ", "
        }
    }

    println("Hello, $names!") // Groovy-style
}

fun StringBuilder.plusAssign(str : String) {
    this.append(str)
}

val Array<*>.indices : Iterable<Int>
get() = IntRange(0, size - 1)

fun println(str : String) {
    System.out?.println(str);
}

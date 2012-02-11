package hn.fast

fun main(args : Array<String>) {
    var names = StringBuilder(); // names : StringBuilder

    for(idx in args.indices) {
        names += args[idx]
        if(idx + 1 < args.size) {
            names += ", "
        }
    }

    println("Hello, $names!") // Groovy-style templates
}

fun StringBuilder.plusAssign(any : Any?) {
    this.append(any)
}

val Array<*>.indices : Iterable<Int>
                get() = IntRange(0, size - 1)

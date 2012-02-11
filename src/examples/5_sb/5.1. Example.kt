package sb.example

import java.util.concurrent.locks.ReentrantLock
import java.util.concurrent.locks.Lock

fun main(args : Array<String>) {
    println(1.abs())
    println(0.abs())
    println((-1).abs())

    val myLock = ReentrantLock()
    lock(myLock) {
        // do something
    }
}

fun Int.abs() = if(this < 0) -this else this

fun <T> lock(l : Lock, body : () -> T) : T {
    l.lock()
    try {
        return body()
    } finally {
        l.unlock()
    }
}

fun println(any : Any?) {
    System.out?.println(any);
}

/*  =>

    @JetMethod(returnType="I", typeParameters="")
    public static final int abs(@JetValueParameter(name="this$receiver", receiver=true) int this$receiver) {
        return this$receiver < 0 ? -this$receiver : this$receiver;
    }

    @JetMethod(returnType="V", typeParameters="")
    public static final void println(@JetValueParameter(name="any", nullable=true, type="?Ljava/lang/Object;") Object any) {
        PrintStream tmp3_0 = System.out; if (tmp3_0 != null) tmp3_0.println(any);
    }

*/


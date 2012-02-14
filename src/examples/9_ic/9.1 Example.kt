package ic

import java.util.ArrayList

fun main(args : Array<String>) {
    val a = ArrayList<String>()
    val WRITE = ""

    // regular call:
    a.contains("123")

    // infix call:
    a contains "123"

    val users = ArrayList<B>

    users
         .filter { it hasPrivilege WRITE }
         .map { it -> it.fullName }
         .orderBy { it.lastName }
}

/*
users
filter { it hasPrivilege WRITE } map { it => it.fullName } orderBy { lastName }
*/

fun ArrayList<B>.filter(f : (A)->Unit) : Mapper {
    return Mapper()
}

class A() {
    fun hasPrivilege(p : String) : Boolean {
        return true;
    }
}

class Mapper() {
    fun map(f : (B)->String) : Sorter {
        return Sorter()
    }
}

class B() {
    val fullName = "f"
    val lastName = "l"
}

class Sorter() {
    fun orderBy(f : (B)->Unit) {

    }
}

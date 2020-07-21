package net.milosvasic.fundamental.kotlin.misc

/**
 * Created by milosvasic on 8/8/16.
 */
class OvrldExmpl(var value: String) {
    operator fun plus(toAdd: OvrldExmpl): OvrldExmpl {
        return OvrldExmpl(value + ", " + toAdd.value)
    }
}

fun operatorOverloadingExample() {
    val a = OvrldExmpl("One")
    val b = OvrldExmpl("Two")
    val c = OvrldExmpl("Three")

    val d = a + b
    val e = a + b + c

    println("A: ${a.value}")
    println("B: ${b.value}")
    println("C: ${c.value}")
    println("D: ${d.value}")
    println("E: ${e.value}")
}
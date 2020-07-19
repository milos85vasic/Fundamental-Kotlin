package net.milosvasic.fundamental.classes

/**
 * Created by mvasic on 7/2/16.
 */
class InnerExample {
    val a = 100

    inner class Inner {
        val b = a
    }
}

fun tryInner() {
    val x = InnerExample().Inner()
    println("Value of b is: ${x.b}")
}
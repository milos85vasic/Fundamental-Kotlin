package net.milosvasic.fundamental.kotlin.object_oriented

fun main() {

    class InnerExample {

        val a = 100

        inner class Inner {

            val b = a
        }
    }

    val x = InnerExample().Inner()
    println("Value of b is: ${x.b}")
}
package net.milosvasic.fundamental.kotlin.object_oriented

fun main() {

    class A {

        val a = 100

        inner class B {

            val b = a
        }
    }

    val v = A().B()
    println("Value of b is: ${v.b}")
}
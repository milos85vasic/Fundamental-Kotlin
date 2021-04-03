package net.milosvasic.fundamental.kotlin.object_oriented

fun main() {

    class A {

        val a = 100

        inner class B {

            val b = a
        }
    }

    val x = A().B()
    println("Value of b is: ${x.b}")
}
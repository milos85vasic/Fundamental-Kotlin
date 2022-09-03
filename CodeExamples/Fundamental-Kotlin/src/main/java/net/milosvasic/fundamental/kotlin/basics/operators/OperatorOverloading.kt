package net.milosvasic.fundamental.kotlin.basics.operators

fun main() {

    class Example(var value: String) {

        operator fun plus(what: Example): Example {

            return Example("$value, ${what.value}")
        }

        operator fun plus(what: String): Example {

            return Example("$value, $what")
        }

        override fun toString() = value
    }

    val a = Example("A")
    val b = Example("B")
    val c = Example("C")

    val ab = a + b
    val abc = a + b + c

    val a2 = a + "Hello"
    val a3 = a + "Hello" + "World"

    val bc = b + "Hello" + c
    val bc2 = b + c + "Hello"

    println("a + b = $ab")
    println("a + b + c = $abc")
    println("a + 'Hello' = $a2")
    println("a + 'Hello' + 'World' = $a3")
    println("b + 'Hello' + c = $bc")
    println("b + c + 'Hello' = $bc2")
}
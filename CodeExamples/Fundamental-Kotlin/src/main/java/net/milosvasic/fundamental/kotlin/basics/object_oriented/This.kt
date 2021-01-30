package net.milosvasic.fundamental.kotlin.basics.object_oriented

fun main() {

    class Example {

        var a: String = "Example"

        fun changeA(a: String) {

            println("'${this@Example.a}' becomes: '$a'")
            this@Example.a = a
        }

        fun printA() = println("Current value is '$a'")
    }

    val example = Example()
    example.printA()
    example.changeA("Hello world")
    example.printA()
    example.changeA("Lorem ipsum")
    example.printA()
    example.changeA("I love Kotlin")
    example.printA()
}
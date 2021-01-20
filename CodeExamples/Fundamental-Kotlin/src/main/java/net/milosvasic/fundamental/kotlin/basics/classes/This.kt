package net.milosvasic.fundamental.kotlin.basics.classes

fun main() {

    class Example {

        var a: String = "Example"

        fun changeA(a: String) {

            println("'${this@Example.a}' becomes: '$a'")
            this@Example.a = a
        }

        fun printA() = println("current -> '$a'")
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
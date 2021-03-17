package net.milosvasic.fundamental.kotlin.object_oriented.extensions

class Example {

    companion object {

        const val a = 10

        fun printA() {

            println("A: $a")
        }
    }
}

val Example.Companion.b: Int
    get() = 20

fun Example.Companion.printB(){

    println("B: $b")
}

fun main(){

    Example.printA()
    Example.printB()
}
package net.milosvasic.fundamental.kotlin.basics.object_oriented

class Greeting {

    companion object {

        fun hello() = println("Hello!")
    }
}

fun main() {

    // We are accessing to 'hello' function without instantiation needed:
    Greeting.hello()
}
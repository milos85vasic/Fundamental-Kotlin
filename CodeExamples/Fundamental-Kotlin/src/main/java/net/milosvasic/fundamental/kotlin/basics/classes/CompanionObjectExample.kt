package net.milosvasic.fundamental.kotlin.basics.classes

class Dummy {

    companion object {

        fun hello(){

            println("Hello!")
        }
    }
}

fun main () {

    // We are accessing to 'hello' function without instantiation needed:
    Dummy.hello()
}
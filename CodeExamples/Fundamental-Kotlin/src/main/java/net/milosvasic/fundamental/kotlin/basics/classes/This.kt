package net.milosvasic.fundamental.kotlin.basics.classes

fun main() {

    class ThisExample {

        var a: String = "Default a"

        fun changeA(a: String) {
            this@ThisExample.a = a
        }

    }
}
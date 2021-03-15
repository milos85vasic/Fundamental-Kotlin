package net.milosvasic.fundamental.kotlin.object_oriented.extensions

fun main() {

    class Hello {

        fun world() {

            println("Hello world")
        }
    }

    fun Hello.everybody() {

        world()
        println("Hello everybody")
    }

    fun Hello.repeat(count: Int, what: String) {

        for (x in 0..count) {

            println(what)
        }
    }

    fun Hello.stranger() {

        println("Hello stranger")
    }

    val hello = Hello()
    hello.world()
    hello.everybody()
    hello.repeat(3, "Woo-hoo")
    hello.stranger()
}

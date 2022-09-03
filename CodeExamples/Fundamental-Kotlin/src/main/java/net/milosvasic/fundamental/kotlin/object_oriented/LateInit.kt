package net.milosvasic.fundamental.kotlin.object_oriented

fun main() {

    class X {

        init {

            println("I am late initialized")
        }

        fun doSomething() = print("Hello")
    }

    class Y {

        lateinit var x: X

        fun doSomething() {

            x = X()
            x.doSomething()
            print(" World!")
        }
    }

    val y = Y()
    y.doSomething()
}

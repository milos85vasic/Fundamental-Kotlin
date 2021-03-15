package net.milosvasic.fundamental.kotlin.object_oriented.extensions

fun main(){


    class Parent {

        fun doSomething() {

            println("Do something...")
        }
    }

    fun Parent.doSomething() {

        this.doSomething()
        println("And the extended it.")
    }

    fun Parent.doSomething(x: Int) {

        println("Extended with parameter passed")
    }

    fun Parent.doSomething2() {

        println("Extended with new method")
    }

    val parent = Parent()
    with(parent) {

        doSomething()
        doSomething(5)
        doSomething2()
    }
}

package net.milosvasic.fundamental.kotlin.basics.classes

fun main() {

    abstract class Animal {

        abstract fun walk()

        fun run() {
            println("run")
        }
    }

    open class Cat : Animal() {

        override fun walk() {

            println("walk")
        }
    }

    abstract class BigCat : Cat() {

        override abstract fun walk()
    }
}
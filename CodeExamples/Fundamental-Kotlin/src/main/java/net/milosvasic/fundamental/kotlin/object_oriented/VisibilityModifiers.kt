package net.milosvasic.fundamental.kotlin.object_oriented

fun main() {

    abstract class Greetings {

        fun hello() = println("Hello")

        protected fun world() = println("World")

        private fun helloWorld() = println("Hello world")

        abstract fun greeting()
    }

    class Greeter : Greetings() {

        override fun greeting() {

            hello()
            world()
        }
    }

    val greeter = Greeter()

    greeter.hello()
    greeter.greeting()
}
package net.milosvasic.fundamental.kotlin.object_oriented

fun main() {

    open class Greetings {

        fun hello() = println("Hello")

        protected fun world() = println("World")

        private fun helloWorld() = println("Hello world")

        open fun greeting() {

            helloWorld()
        }
    }

    class Greeter : Greetings() {

        override fun greeting() {

            hello()
            world()
        }
    }

    val greetings = Greetings()
    val greeter = Greeter()

    println("Greetings:")
    greetings.hello()
    greetings.greeting()

    println("Greeter:")
    greeter.hello()
    greeter.greeting()
}
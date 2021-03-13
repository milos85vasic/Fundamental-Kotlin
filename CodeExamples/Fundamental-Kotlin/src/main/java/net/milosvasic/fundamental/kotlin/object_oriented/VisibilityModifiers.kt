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

    val greeter = Greeter()

    greeter.hello()
    greeter.greeting()
}
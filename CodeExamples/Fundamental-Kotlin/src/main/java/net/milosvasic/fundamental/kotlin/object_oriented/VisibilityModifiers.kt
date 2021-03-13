package net.milosvasic.fundamental.kotlin.object_oriented

fun main() {

    open class A {

        fun hello() = println("Hello")

        protected fun world() = println("World")

        private fun helloWorld() = println("Hello world")

        open fun greeting() {

            helloWorld()
        }
    }

    class B : A() {

        override fun greeting() {

            hello()
            world()
        }
    }

val a = A()
val b = B()

println("A:")
a.hello()
a.greeting()

println("B:")
b.hello()
b.greeting()
}
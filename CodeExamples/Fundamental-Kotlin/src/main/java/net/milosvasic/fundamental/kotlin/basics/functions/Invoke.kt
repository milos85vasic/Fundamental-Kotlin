package net.milosvasic.fundamental.kotlin.basics.functions

fun main() {

    class Invokable {

        operator fun invoke(): Invokable {

            println("I am invoked")
            return this
        }
    }

    val invoker = Invokable()
    invoker()
}
package net.milosvasic.fundamental.kotlin.scope_functions

fun main() {

    class Hello {

        fun execute() = println("Hello!")
    }

    Hello()
        .also {

            println("Hey!")
        }.execute()
}
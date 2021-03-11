package net.milosvasic.fundamental.kotlin.misc

fun main() {

    @Throws(IllegalArgumentException::class)
    fun fail(message: String): Nothing {

        throw IllegalArgumentException(message)
    }

    @Throws(IllegalArgumentException::class)
    fun printer(vararg what: String?) =
        what.forEach {
            println(
                it ?: fail("Invalid input, stopping")
            )
        }

    try {

        printer("Hello world", null, "Ok")
    } catch (e: IllegalArgumentException) {

        println("${e.message}")
    }
}
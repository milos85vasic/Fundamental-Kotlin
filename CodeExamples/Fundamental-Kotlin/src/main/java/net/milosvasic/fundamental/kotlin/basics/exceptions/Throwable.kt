package net.milosvasic.fundamental.kotlin.basics.exceptions

import kotlin.system.exitProcess

fun main() {

    fun fail(t: Throwable) {

        println(t.message)
        exitProcess(1)
    }

    @Throws(Throwable::class)
    fun process(what: Int) {

        if (what < 0) {

            throw Throwable("Error")
        }
        println("Processing: $what")
    }

    val items = listOf(2, 4, 6, 0, -2, -4, -6)
    items.forEach {
        try {

            process(it)
        } catch (t: Throwable) {

            fail(t)
        }
    }
}
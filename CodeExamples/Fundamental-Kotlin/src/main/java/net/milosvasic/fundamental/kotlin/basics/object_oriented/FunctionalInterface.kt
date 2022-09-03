package net.milosvasic.fundamental.kotlin.basics.object_oriented

fun interface Executable {

    fun execute(what: String?): Boolean
}

fun main() {

    val empty = Executable { it == null || it.isEmpty() }

    listOf("", null, "Hello", "World").forEach {

        if (empty.execute(it)) {
            println("No data")
        } else {
            println(it)
        }
    }
}
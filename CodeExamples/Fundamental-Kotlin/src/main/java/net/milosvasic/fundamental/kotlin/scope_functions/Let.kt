package net.milosvasic.fundamental.kotlin.scope_functions

fun main() {

    fun filterShort(text: String): String? {

        if (text.length >= 5) {

            return text
        }
        return null
    }

    listOf(
        "Hello",
        "world",
        "i",
        "am",
        "here"
    ).forEach { word ->

        val filtered = filterShort(word)
        filtered?.let {

            println(it)
        }
    }
}
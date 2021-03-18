package net.milosvasic.fundamental.kotlin.object_oriented.extensions

fun main() {

    fun String.stripDownWithUnderscores(): String {

        return replace(" ", "_")
    }

    listOf(

        "Hello world",
        "Lorem ipsum"
    ).forEach {

        val stripped = it.stripDownWithUnderscores()
        println(stripped)
    }
}
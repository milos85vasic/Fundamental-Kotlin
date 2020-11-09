package net.milosvasic.fundamental.kotlin.basics.functions

inline fun inlined(function: () -> Unit) {

    function()
}

fun main() {

    fun hello() {

        println("Hello!")
    }

    inlined(::hello)
}
package net.milosvasic.fundamental.kotlin.functions

fun main() {

    fun execute(what: () -> String): String {

        return what()
    }

    fun printString(): String {

        return "Some string..."
    }

    var string = execute(::printString)
    println(string)

    string = execute { "Yet some other string" }
    println(string)
}

package net.milosvasic.fundamental.kotlin.basics.references.leaks

fun main() {

    class Wrapper(var data: String)

    val vehicles = mutableMapOf<Wrapper, Int>()

    val word = "Kotlin"
    for (x in 0 until 100) {

        vehicles[Wrapper(word)] = x
    }
}
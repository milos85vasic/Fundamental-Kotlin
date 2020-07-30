package net.milosvasic.fundamental.kotlin.basics.data_types

fun booleans() {

    val number = 1
    val a = number == 1
    val b = number == 2
    println("a || b -> ${a || b}")
    println("a && b -> ${a && b}")
    println("!a || !b -> ${!a || !b}")
}

fun main() = booleans()
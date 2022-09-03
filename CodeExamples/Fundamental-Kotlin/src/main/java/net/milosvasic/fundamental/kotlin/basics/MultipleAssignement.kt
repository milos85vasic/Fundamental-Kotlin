package net.milosvasic.fundamental.kotlin.basics

fun parameters(): List<Int> {

    return listOf(2, 4, 6)
}

fun main() {

    val (first, second) = arrayOf(1, 2)

    println("First: $first")
    println("Second: $second")

    fun parameters(): List<Int> {

        return listOf(3, 5, 7)
    }

    val (parameter1, parameter2, parameter3) = parameters()
    println("Parameters: $parameter1, $parameter2, $parameter3")
}
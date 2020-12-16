package net.milosvasic.fundamental.kotlin.basics.collections

fun main() {

    val numbers = listOf(0, 1, 2, 3, 4, 5)
    val squares = numbers.map { it * it }

    numbers.forEachIndexed { index, it ->

        println("Square of $it is: ${squares[index]}")
    }
}
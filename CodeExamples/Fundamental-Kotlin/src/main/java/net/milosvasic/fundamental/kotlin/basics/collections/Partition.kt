package net.milosvasic.fundamental.kotlin.basics.collections

fun main() {

    val numbers = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val partitioned = numbers.partition { it % 2 == 0 }

    println("Original: $numbers")
    println("Partitioned: $partitioned")
}
package net.milosvasic.fundamental.kotlin.basics.collections

fun main() {

    val items = listOf(2, 4, 6, 8, 10)
    val max = items.maxOrNull()
    val min = items.minOrNull()

    println("Fro: $items")
    println("Max. is: $max")
    println("Min. is: $min")
}

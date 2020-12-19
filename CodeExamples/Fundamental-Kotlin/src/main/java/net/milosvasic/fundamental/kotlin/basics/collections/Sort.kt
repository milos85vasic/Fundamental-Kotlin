package net.milosvasic.fundamental.kotlin.basics.collections

fun main() {

    val numbers = listOf(1, 8, 9, 4, 5, 22, 44, 645, 67).sorted()
    println("Sorted numbers: $numbers")

    val stringNumbers = listOf("1", "-3", "5").sortedBy { it.toInt() }
    println("Sorted string numbers: $stringNumbers")

    val words = mapOf("Yin" to "Yang", "Lorem" to "Ipsum", "Hello" to "World")
    println("Sorted map: ${words.toSortedMap()}")

    val set = setOf(2, 4, 4, 2, 0, 1, 3, 6, 4, 5).sorted()
    println("Sorted set: $set")
    val resorted = set.sortedBy { it % 2 == 0 }
    println("Re-sorted set: $resorted")
}

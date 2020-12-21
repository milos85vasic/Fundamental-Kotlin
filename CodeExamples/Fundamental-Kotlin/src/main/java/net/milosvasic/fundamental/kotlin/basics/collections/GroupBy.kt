package net.milosvasic.fundamental.kotlin.basics.collections

fun main() {

    val words = listOf("a", "plane", "to", "car", "window")
    val grouped = words.groupBy { it.length }

    println("$words -> $grouped")
}

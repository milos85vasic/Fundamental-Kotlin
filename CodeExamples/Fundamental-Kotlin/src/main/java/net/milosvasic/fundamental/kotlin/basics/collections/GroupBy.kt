package net.milosvasic.fundamental.kotlin.basics.collections

fun main() {

    val itemsToGroup = listOf("x", "y", "xy", "zzz", "xz")
    val groupedItems = itemsToGroup.groupBy { it.length }
}

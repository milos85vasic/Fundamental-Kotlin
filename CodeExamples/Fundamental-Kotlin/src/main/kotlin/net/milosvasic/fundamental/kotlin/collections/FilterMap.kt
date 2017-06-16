package net.milosvasic.fundamental.kotlin.collections

val items = listOf(1,2, 3, 4, 5, 6, 7, 8, 9)

fun filterMapItems() : List<Int> {
    return items.filter { it % 2 == 0 }
}
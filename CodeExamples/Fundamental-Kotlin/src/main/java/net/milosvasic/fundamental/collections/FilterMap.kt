package net.milosvasic.fundamental.collections

fun filterItems(items: List<Int>) : List<Int> {
    return items.filter { it % 2 == 0 }
}

fun filterMapItems(items: List<Int>) : List<Int> {
    return items.map { it + 1000 }
}
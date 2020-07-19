package net.milosvasic.fundamental.collections

val itemsToGroup = listOf("x", "y", "xy", "zzz", "xz")
val groupedItems = itemsToGroup.groupBy { it.length }

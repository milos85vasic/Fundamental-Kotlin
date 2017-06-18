package net.milosvasic.fundamental.kotlin.collections

val itemsToGroup = listOf("x", "y", "xy", "zzz", "xz")
val groupedItems = itemsToGroup.groupBy { it.length }

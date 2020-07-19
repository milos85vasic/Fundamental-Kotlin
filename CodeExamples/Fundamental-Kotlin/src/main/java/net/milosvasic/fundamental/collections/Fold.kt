package net.milosvasic.fundamental.collections

val itemsToFold = listOf(2, 4, 6, 8, 10, -20)
val foldedItems = itemsToFold.fold(0, { part, element -> part + element })

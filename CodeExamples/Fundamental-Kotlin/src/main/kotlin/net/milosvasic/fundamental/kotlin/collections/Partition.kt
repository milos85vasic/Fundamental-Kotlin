package net.milosvasic.fundamental.kotlin.collections

val itemsToPartition = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val partitionedItems = itemsToPartition.partition { it % 2 == 0 }
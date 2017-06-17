package net.milosvasic.fundamental.kotlin.collections

val toSort = listOf(1, 8, 9, 4, 5, 22, 44, 645, 67)
val sorted = toSort.sorted()

val toSort2 = listOf("1", "-3", "5")
val sorted2 = toSort2.sortedBy { it.toInt() }

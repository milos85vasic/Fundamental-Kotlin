package net.milosvasic.fundamental.kotlin.collections

val animals = listOf("Elephant", "Lion")
val flatMapResult = animals.flatMap { it.toList() }
val flatMapResult2 = animals.flatMap { listOf(it, it, it) }

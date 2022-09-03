package net.milosvasic.fundamental.kotlin.basics.collections

fun main() {

    val animals = mapOf(0 to "Elephant", 1 to "Lion", 2 to "Snake", 3 to "Ape")
    val animalsList = animals.flatMap { listOf(it.value) }

    println(animals)
    println(animalsList)

    val words = listOf("Hello", "World", "Airplane", "Car", "Beethoven", "Lorem", "Ipsum")
    val allLetters = words.flatMap { it.toLowerCase().toList() }

    val letters = mutableSetOf<Char>()
    val sortedLetters = mutableListOf<Char>()

    letters.addAll(allLetters)
    sortedLetters.addAll(letters)
    sortedLetters.sort()

    println(allLetters)
    println(sortedLetters)

    println("- - -")
    val distinct = allLetters.distinct().sorted()
    println(distinct)
}
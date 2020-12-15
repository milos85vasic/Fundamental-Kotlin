package net.milosvasic.fundamental.kotlin.basics.collections

fun main() {

    val animals = mapOf(0 to "Elephant", 1 to "Lion", 2 to "Snake", 3 to "Ape")
    val animalsList = animals.flatMap { listOf(it.value) }

    val words = listOf("Hello", "World")
    val letters = mutableSetOf<Char>()
    val sortedLetters = mutableListOf<Char>()
    val allLetters = words.flatMap { it.toLowerCase().toList() }

    letters.addAll(allLetters)
    sortedLetters.addAll(letters)
    sortedLetters.sort()

    println(animals)
    println(animalsList)
    println(sortedLetters)
}
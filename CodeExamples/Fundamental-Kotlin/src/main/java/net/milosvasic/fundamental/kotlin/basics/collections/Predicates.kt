package net.milosvasic.fundamental.kotlin.basics.collections


fun main() {

    val check: (Int) -> Boolean = { it > 0 }

    fun atLeastOnePositive(items: List<Int>): Boolean {

        return items.any(check)
    }

    fun hasAllItemsPositive(items: List<Int>): Boolean {

        return items.all(check)
    }

    fun numberOfPositiveNumbers(items: List<Int>): Int {

        return items.count(check)
    }

    val numbers = listOf(-3, -2, -1, 0, 1, 2, 3, 4, 5)
    val atLeastOnePositive = atLeastOnePositive(numbers)
    val hasAllItemsPositive = hasAllItemsPositive(numbers)
    val numberOfPositiveNumbers = numberOfPositiveNumbers(numbers)

    println("Collection $numbers: ")
    println("- has at least one positive: $atLeastOnePositive")
    println("- has all items positive: $hasAllItemsPositive")
    println("- number of positive numbers: $numberOfPositiveNumbers")
}
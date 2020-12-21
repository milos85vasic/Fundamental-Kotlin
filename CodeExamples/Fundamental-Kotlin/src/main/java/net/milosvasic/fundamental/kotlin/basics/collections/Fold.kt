package net.milosvasic.fundamental.kotlin.basics.collections

fun main() {

    val numbers = listOf(2, 4, 6, 8, 10, -20)
    val folded = numbers.fold(

        initial = 0,
        operation = { part, element -> part + element }
    )

    println(numbers)
    println(folded)
}

package net.milosvasic.fundamental.kotlin.builders

fun main() {

    val builder = StringBuilder()
        .append("Hello world!")
        .append("\n")
        .append("Numbers: ")

    val numbers = StringBuilder()
    for (number in 1..3) {

        numbers.append(number)
            .append(" ")
    }

    val text = builder.append(numbers)
        .append("\n")
        .append("Lore ipsum...")
        .toString()

    println(text)
}
package net.milosvasic.fundamental.kotlin.basics.data_types

fun underscoredNumbers() {

    val millions = 5_000_000
    val hexBytes = 0xFF_EE_FF_EE
    val bigOne = 1111_2222_3333_4444L
    val bytes = 0b11001100_11001100_11001100_11001100
}

fun numbers() {

    val a = 1 // "Int" number type
    val b = a.toLong() // Convert "Int" into "Long"

    println("a: $a") // prints: 1
    println("b: $b") // prints: 1
    print(a == b.toInt()) // We compare "a" and "b", it prints: true,
                          // which is Boolean data type.
}

fun main() = numbers()

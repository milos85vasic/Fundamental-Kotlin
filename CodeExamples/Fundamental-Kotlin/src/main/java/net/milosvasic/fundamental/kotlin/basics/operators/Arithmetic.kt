package net.milosvasic.fundamental.kotlin.basics.operators

fun main() {

    val a = 1
    val b = 2
    val c = 3
    val hello = "Hello"
    val world = "World"

    // "+" - Addition:
    val sum = a + b + c
    println("a + b + c = $sum")

    val concatenation = hello + " " + world
    // or converted into the template:
    // concatenation = "$hello $world"
    println(concatenation)

    // "-" - Subtraction:
    val sub = c - b
    println("c - b = $sub")

    // "*" - Multiplication:
    val multi = b * c
    println("b * c = $multi")

    // "/" - Division:
    val div = 12 / c
    println("12 / c = $div")

    // "%" - Modulus:
    val mod = c % b
    println("c % b = $mod")
}
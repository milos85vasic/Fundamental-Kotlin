package net.milosvasic.fundamental.kotlin.basics.functions

fun main() {

    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {

        return operation(a, b)
    }

    fun sum(a: Int, b: Int) = a + b

    fun diff(a: Int, b: Int) = a - b

    val a = 1
    val b = 2

    val calculateSum = calculate(a, b, ::sum)
    val calculateDiff = calculate(a, b, ::diff)

    println("calculate(a, b, ::sum) == $calculateSum")
    println("calculate(a, b, ::diff) == $calculateDiff")
}
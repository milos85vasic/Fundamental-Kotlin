package net.milosvasic.fundamental.kotlin.basics.functions

fun main() {

    fun sum(vararg args: Int): Int {

        var sum = 0
        for (x in args) {
            sum += x
        }
        return sum
    }

    fun sumAndMultiply(multiply: Int, vararg args: Int) {

        val sum = sum(*args)
        val result = sum * multiply
        println("Sum: $sum, and multiply: $result")
    }

    val multiply = 100
    sumAndMultiply(multiply)
    sumAndMultiply(multiply, 1)
    sumAndMultiply(multiply, 1, 2)
    sumAndMultiply(multiply, 1, 2, 3)
    sumAndMultiply(multiply, 1, 2, 3, 4)
}
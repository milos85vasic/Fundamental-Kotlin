package net.milosvasic.fundamental.kotlin.basics.functions

fun main() {

    fun sum(vararg args: Int) {

        var sum = 0
        for (x in args) {
            sum += x
        }
        println("Sum: $sum")
    }

    fun sumAndMultiply(multiply: Int, vararg args: Int) {

        var sum = 0
        for (x in args) {
            sum += x
        }
        val result = sum * multiply
        println("Sum and multiply: $result")
    }

    sum()
    sum(1)
    sum(1, 2)
    sum(1, 2, 3)
    sum(1, 2, 3, 4)

    val multiply = 100
    sumAndMultiply(multiply)
    sumAndMultiply(multiply, 1)
    sumAndMultiply(multiply, 1, 2)
    sumAndMultiply(multiply, 1, 2, 3)
    sumAndMultiply(multiply, 1, 2, 3, 4)
}
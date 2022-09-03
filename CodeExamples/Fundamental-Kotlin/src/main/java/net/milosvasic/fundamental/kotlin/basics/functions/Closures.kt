package net.milosvasic.fundamental.kotlin.basics.functions

fun main() {

    val values = listOf(2, 4, 6, 8, 10)

    fun calculate(): Int {

        var result = 0
        values.forEach {

            result += it
        }
        return result
    }

    println("Result is: ${calculate()}")
}


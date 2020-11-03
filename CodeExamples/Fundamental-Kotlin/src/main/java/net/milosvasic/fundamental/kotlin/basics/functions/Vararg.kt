package net.milosvasic.fundamental.kotlin.basics.functions

fun main() {

    fun sum(vararg args: Int) {

        var sum = 0
        for (x in args) {
            sum += x
        }
        println("Sum: $sum")
    }

    sum()
    sum(1)
    sum(1, 2)
    sum(1, 2, 3)
    sum(1, 2, 3, 4)
}
package net.milosvasic.fundamental.kotlin.basics.looping

fun main() {

    fun counter(to: Int) {

        var x = 0
        do {

            println("x: $x")
            x++
        } while (x <= to)
    }

    val numbers = intArrayOf(0, 1, 2)
    numbers.forEach {

        println("Counting to: $it")
        counter(it)
        println()
    }
}
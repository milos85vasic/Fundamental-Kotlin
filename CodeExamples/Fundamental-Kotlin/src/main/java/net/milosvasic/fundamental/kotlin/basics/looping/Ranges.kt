package net.milosvasic.fundamental.kotlin.basics.looping

fun main() {

    fun range(to: Int) {

        for (x in 0..to) println("x: $x")
    }

    fun checkInRange(what: Int, to: Int) {

        if (what !in 0..to) println("No $what is not in range between 0 and $to")
    }

    range(5)

    for (x in -5..10) {

        checkInRange(x, 5)
    }
}

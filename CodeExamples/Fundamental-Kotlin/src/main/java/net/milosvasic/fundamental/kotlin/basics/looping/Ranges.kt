package net.milosvasic.fundamental.kotlin.basics.looping

fun main() {

    fun range(to: Int) {

        for (x in 0..to) println("x: $x")
    }

    fun reverseRange(to: Int) {

        for (x in to downTo 0) println("x: $x")
    }

    fun checkInRange(what: Int, to: Int) {

        if (what in 0..to) {
            println("$what is in range between 0 and $to")
        } else {
            println("$what is NOT in range between 0 and $to")
        }
    }

    range(5)
    reverseRange(5)

    for (x in -5..10) {

        checkInRange(x, 5)
    }
}

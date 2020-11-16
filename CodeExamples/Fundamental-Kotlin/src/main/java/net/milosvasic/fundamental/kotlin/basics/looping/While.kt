package net.milosvasic.fundamental.kotlin.basics.looping

fun main() {

    fun counter(to: Int) {

        var x = 0
        while (x <= to) {
            println("X: $x")
            x++
        }
    }

    counter(5)
}
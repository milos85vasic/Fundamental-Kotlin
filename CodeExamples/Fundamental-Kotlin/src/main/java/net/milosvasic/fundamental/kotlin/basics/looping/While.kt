package net.milosvasic.fundamental.kotlin.basics.looping

fun main() {

    fun counter(to: Int) {

        var x = 0
        while (x <= to) {
            println("x: $x")
            x++
        }
    }

    counter(5)
}
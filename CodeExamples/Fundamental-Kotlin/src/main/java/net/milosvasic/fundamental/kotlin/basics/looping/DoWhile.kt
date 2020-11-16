package net.milosvasic.fundamental.kotlin.basics.looping

fun main() {

    fun counter(to: Int) {
        var x = 0
        do {
            println("[ $x ]")
            x++
        } while (x <= to)
    }

    counter(5)
}
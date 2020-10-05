package net.milosvasic.fundamental.kotlin.basics.syntax

fun main() {

    fun compare(x: Int, y: Int): Int {

        if (x > y) {
            return 1
        } else if (x < y) {
            return -1
        }
        return 0
    }

    // Single line version:
    // fun compare(x: Int, y: Int) = if (x > y) 1 else if (x < y) -1 else 0

    var x = 1
    var y = 2
    println("Compare $x vs $y: ${compare(x, y)}")

    x = 2
    y = 1
    println("Compare $x vs $y: ${compare(x, y)}")

    x = 2
    y = 2
    println("Compare $x vs $y: ${compare(x, y)}")
}
package net.milosvasic.fundamental.kotlin.syntax

fun counter2(to: Int) {
    var x = 0
    while (x <= to) {
        println("[ $x ]")
        x++
    }
}

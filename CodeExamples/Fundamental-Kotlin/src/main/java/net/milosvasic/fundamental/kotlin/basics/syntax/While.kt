package net.milosvasic.fundamental.kotlin.basics.syntax

fun counter2(to: Int) {
    var x = 0
    while (x <= to) {
        println("[ $x ]")
        x++
    }
}

fun counter3(to: Int) {
    var x = 0
    do {
        println("[ $x ]")
        x++
    } while (x <= to)
}

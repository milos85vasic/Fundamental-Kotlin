package net.milosvasic.fundamental.syntax

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

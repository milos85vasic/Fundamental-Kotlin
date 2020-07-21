package net.milosvasic.fundamental.kotlin.basics.controll_flow

fun conting() {
    var x = 0
    while (x < 100) {
        println("X: $x")
        x++
    }
}

fun counting2() {
    var x = 0
    do {
        println("X: $x")
        x++
    } while (x < 100)
}
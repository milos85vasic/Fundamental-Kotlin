package net.milosvasic.fundamental.kotlin.basics.controll_flow

/**
 * Created by milosvasic on 6/8/16.
 */
fun whileExample() {
    var x = 0
    while (x < 100) {
        println("X: $x")
        x++
    }
}

fun doWhileExample() {
    var x = 0
    do {
        println("X: $x")
        x++
    } while (x < 100)
}
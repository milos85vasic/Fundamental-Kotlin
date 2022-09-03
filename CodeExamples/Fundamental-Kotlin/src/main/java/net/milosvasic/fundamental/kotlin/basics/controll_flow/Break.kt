package net.milosvasic.fundamental.kotlin.basics.controll_flow

fun main() {

    for (x in 0..10) {
        if (x == 5) {
            break
        }
        println("x: $x")
    }
}
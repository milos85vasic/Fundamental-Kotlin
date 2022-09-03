package net.milosvasic.fundamental.kotlin.basics.controll_flow

fun main() {

    val x = 10
    val y = 3
    val z = 2

    myLoop@ for (a in 0..x) {
        for (b in 0..y) {

            println("$a, $b ")
            if (a == z && b == z) {

                // Does not break the current loop,
                // but the one than encloses it:
                break@myLoop
            }
        }
    }
}

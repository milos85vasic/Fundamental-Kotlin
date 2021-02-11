package net.milosvasic.fundamental.kotlin.basics.controll_flow

fun main() {

    fun check(x: Int, y: Int) {

        val result = if (x >= y) {

            println("x >= y")
            true
        } else {

            println("x is not >= y")
            false
        }
        println("Result: $result")
    }

    check(2, 5)
    check(2, 2)
    check(5, 2)
}
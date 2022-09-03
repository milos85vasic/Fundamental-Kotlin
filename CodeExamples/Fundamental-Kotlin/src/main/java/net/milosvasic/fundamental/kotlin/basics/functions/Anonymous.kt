package net.milosvasic.fundamental.kotlin.basics.functions

fun main() {

    val f1 = fun(x: Int, y: Int): Int {

        return x + y
    }

    val f2 = fun(x: Int, y: Int) = x + y


    val x = f2(1, 2)
    val y = f1(3, 4)

    println("x: $x")
    println("y: $y")
}

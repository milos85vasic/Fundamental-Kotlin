package net.milosvasic.fundamental.kotlin.syntax

/**
 * Created by milosvasic on 6/4/16.
 */
fun sum(x: Int, y: Int): Int {
    return x + y
}

fun sumSimplified(x: Int, y: Int) = x + y

fun noReturnValue(x: Int, y: Int): Unit {
    println("Sum is ${x + y}")
}

fun noReturnValue2(x: Int, y: Int) {
    println("Sum is ${x + y}")
}

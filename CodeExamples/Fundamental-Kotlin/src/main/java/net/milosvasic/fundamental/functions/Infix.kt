package net.milosvasic.fundamental.functions

/**
 * Created by mvasic on 7/19/16.
 */

/**
 * NOTE: This example is removed from original book.
 * I plan to introduce it back to 2nd edition.
 */
infix fun Double.powerPI(x: Int): Double {
    return Math.pow(this, x + Math.PI)
}

/**
 * NOTE: This example is removed from original book.
 * I plan to introduce it back to 2nd edition.
 */
fun infixExample() {
    val array = arrayOf(2.0, 4.0, 6.0, 8.0, 10.0)
    for (value in array) {
        val result = value powerPI 5
        println("Result: [ $value ][ $result ]")
    }
}
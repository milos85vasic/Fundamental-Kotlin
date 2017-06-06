package net.milosvasic.fundamental.kotlin.syntax

/**
 * This example returns incremented value
 * if passed parameter is positive number
 * otherwise it returns null.
 */
fun incrementPositive(x: Int): Int? {
    return if (x > 0) x + 1 else null
}

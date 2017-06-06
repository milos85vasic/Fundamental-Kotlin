package net.milosvasic.fundamental.kotlin.syntax

/**
 * Power if double.
 */
fun power(x: Any): Double {
    if (x is Double) {
        return Math.pow(x, 2.0)
    }
    throw IllegalArgumentException("This method eals only with doubles!")
}

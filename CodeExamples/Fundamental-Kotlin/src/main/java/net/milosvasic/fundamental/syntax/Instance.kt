package net.milosvasic.fundamental.syntax

/**
 * Power if double.
 */
fun power(x: Any): Double {
    if (x is Double) {
        return Math.pow(x, 2.0)
    }
    throw IllegalArgumentException("This method eals only with doubles!")
}

/**
 * Casts explicitly into String.
 */
fun logger(value: Any) {
    val toPrint: String = value as String
    println("[ $toPrint ]")
}
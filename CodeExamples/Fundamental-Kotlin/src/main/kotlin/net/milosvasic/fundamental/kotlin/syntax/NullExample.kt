package net.milosvasic.fundamental.kotlin.syntax

/**
 * Returns incremented value if passed parameter is positive number
 * otherwise returns null.
 */
fun getMeSomeValueIncremented(x: Int): Int? {
    if (x > 0) return x + 1
    return null
}

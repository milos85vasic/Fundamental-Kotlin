package net.milosvasic.fundamental.syntax

/**
 * This example returns incremented value
 * if passed parameter is positive number
 * otherwise it returns null.
 */
fun incrementPositive(x: Int): Int? {
    return if (x > 0) x + 1 else null
}

/**
 * s1 - cannot assign null values!
 * s2 - can assign null values
 */
var s1: String = "this variable cannot store null references"
var s2: String? = null


/**
 * If word is not null print it.
 */
fun printer(word: String?) {
    word?.let {
        val uppercase = word.toUpperCase()
        println("Word [ $uppercase ]")
    }
}
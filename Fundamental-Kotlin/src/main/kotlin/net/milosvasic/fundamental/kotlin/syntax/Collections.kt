package net.milosvasic.fundamental.kotlin.syntax

/**
 * Created by mvasic on 6/5/16.
 */
fun collectionsExample(words: List<String>) {
    // Check if there is some exact word, if yes return
    if ("Something to match" in words) return
    // If no continue with method execution ...
    // Let's iterate:
    for (x in words) {
        println(x)
    }
}

fun collectionsExample2(numbers: List<Double>): List<Double> {
    // Let's apply some lambdas:
    return numbers
            .filter {
                it > 100
            }
            .sortedBy { it }
}

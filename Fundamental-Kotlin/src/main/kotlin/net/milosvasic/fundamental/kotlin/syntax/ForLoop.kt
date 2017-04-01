package net.milosvasic.fundamental.kotlin.syntax

/**
 * Created by mvasic on 6/5/16.
 */
fun forLoopExample(numbers: List<Int>) {
    for (x in numbers) println("Number $x")
}

fun forLoopExampleWithIndex(numbers: List<Int>) {
    for (x in numbers.indices) println("Number ${numbers[x]}")
}
package net.milosvasic.fundamental.kotlin.syntax

/**
 * Created by mvasic on 6/5/16.
 */
fun whileLoopExample(numbers: List<Int>) {
    var x = 0
    while (x < numbers.size) {
        println("Number ${numbers[x++]}")
    }
}

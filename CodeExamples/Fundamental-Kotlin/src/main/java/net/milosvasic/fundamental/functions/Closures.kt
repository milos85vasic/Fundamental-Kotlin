package net.milosvasic.fundamental.functions

/**
 * Created by mvasic on 7/30/16.
 */
fun tryClosures() {

    val values = listOf<Int>(2, 4, 6, 8, 10)
    var result = 0
    values.forEach {
        result += it
    }
    println("Result: $result")

}


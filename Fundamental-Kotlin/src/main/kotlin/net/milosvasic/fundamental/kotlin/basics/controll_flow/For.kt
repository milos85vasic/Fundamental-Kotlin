package net.milosvasic.fundamental.kotlin.basics.controll_flow

/**
 * Created by milosvasic on 6/8/16.
 */
fun forExample(array: Array<String>) {
    for ((index, value) in array.withIndex()) {
        println("[ $index ][ $value ]")
    }
}

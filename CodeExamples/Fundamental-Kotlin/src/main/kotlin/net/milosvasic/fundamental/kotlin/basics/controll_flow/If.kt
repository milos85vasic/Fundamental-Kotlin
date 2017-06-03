package net.milosvasic.fundamental.kotlin.basics.controll_flow

/**
 * Created by milosvasic on 6/7/16.
 */
fun ifExample(x: Int, y: Int) {
    val result = if (x >= y) {
        println("Condition ok.")
        true
    } else {
        println("Condition else.")
        false
    }
    println("Result $result")
}

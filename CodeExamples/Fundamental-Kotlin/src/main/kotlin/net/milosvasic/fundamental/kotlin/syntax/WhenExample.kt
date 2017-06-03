package net.milosvasic.fundamental.kotlin.syntax

/**
 * Created by mvasic on 6/5/16.
 */
fun whenExample(x: Any) {
    when (x) {
        25.5 -> println(":)")
        is Int -> println("Number is $x")
        is String -> println(x)
        is Boolean -> if (x) println("It's true.")
        else -> println("Unknown")
    }
}

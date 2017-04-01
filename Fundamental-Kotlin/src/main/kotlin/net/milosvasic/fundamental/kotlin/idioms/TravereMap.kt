package net.milosvasic.fundamental.kotlin.idioms

/**
 * Created by mvasic on 6/5/16.
 */
fun traverseMapExample(map: Map<String, Int>) {
    for ((key, value) in map) println("$key : $value")
}
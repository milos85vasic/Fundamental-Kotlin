package net.milosvasic.fundamental.kotlin.functions

/**
 * Created by mvasic on 8/6/16.
 */
inline fun inlined(function: () -> Unit) {
    function.invoke()
}

fun usedByInlined() {
    println("Inlined")
}

fun useInlinedExample() {
    inlined(::usedByInlined)
}
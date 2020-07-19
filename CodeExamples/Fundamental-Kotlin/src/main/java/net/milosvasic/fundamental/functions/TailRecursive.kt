package net.milosvasic.fundamental.functions

/**
 * Created by mvasic on 7/20/16.
 */
tailrec fun tailRecursiveExample(word: String) {
    if (word.length == 1) {
        println("--- end")
    } else {
        println(word)
        tailRecursiveExample(word.substring(0..(word.length - 2)))
    }
}

fun tryTailRecursiveExample() {
    tailRecursiveExample("My word")
}

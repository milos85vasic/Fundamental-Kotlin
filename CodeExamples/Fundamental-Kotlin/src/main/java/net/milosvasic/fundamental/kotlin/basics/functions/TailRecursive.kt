package net.milosvasic.fundamental.kotlin.basics.functions

fun main() {

    tailrec fun tailRecursiveExample(word: String) {

        if (word.length == 1) {

            println(word)
        } else {

            println(word)
            tailRecursiveExample(word.substring(0..(word.length - 2)))
        }
    }

    tailRecursiveExample("Hello world")
}
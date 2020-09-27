package net.milosvasic.fundamental.kotlin.basics.syntax

fun compare(x: Int, y: Int): Int {
    if (x > y) {
        return 1
    } else if (x < y) {
        return -1
    }
    return 0
}

fun compare2(x: Int, y: Int) = if (x > y) 1 else if (x < y) -1 else 0

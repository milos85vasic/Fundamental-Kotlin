package net.milosvasic.fundamental.functions

/**
 * Created by mvasic on 7/20/16.
 */
fun sum(vararg args: Int) {
    var sum = 0
    for (x in args) {
        sum += x
    }
    println("Sum: $sum")
}

fun trySum(){
    sum(1, 3, 6, 10, 1, 2, 3, 4)
}
package net.milosvasic.fundamental.kotlin.functions

/**
 * Created by mvasic on 8/6/16.
 */
fun doSomething1() {
    println("Do something 1")
}

fun doSomething2() {
    println("Do something 2")
}

inline fun noinlineExample(something1: () -> Unit, noinline something2: () -> Unit) {
    something1.invoke()
    something2.invoke()
}

fun useNoinlineExample() {
    noinlineExample(
            ::doSomething1,
            ::doSomething2
    )
}
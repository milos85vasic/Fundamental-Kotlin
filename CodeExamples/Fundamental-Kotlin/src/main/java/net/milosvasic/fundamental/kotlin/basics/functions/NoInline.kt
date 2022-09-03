package net.milosvasic.fundamental.kotlin.basics.functions

inline fun noInlined(f1: () -> Unit, noinline f2: () -> Unit) {

    f1()
    f2()
}

fun main() {

    fun hello() = println("Hello")

    fun world() = println("World")

    noInlined(::hello, ::world)
}
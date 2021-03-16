package net.milosvasic.fundamental.kotlin.object_oriented.extensions

class ExtendMe {

    val a = 15
}

val ExtendMe.b: Int
    get() = 25

fun main(){

    val extended = ExtendMe()
    println("A: ${extended.a}")
    println("B: ${extended.b}")
}
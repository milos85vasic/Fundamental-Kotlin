package net.milosvasic.fundamental.kotlin.basics

// Constants:
// We provide type and the value:
val x: Int = 1

// Simplified: Int type is inferred
val y = 1

// Type is required when no initializer is provided:
// val z: Int

// Variable:
var z: Int = 0

fun main() {

    var m = 1
    println("M is: $m")
    m = 2
    println("M is: $m")
    m = 3
    println("M is: $m")
}

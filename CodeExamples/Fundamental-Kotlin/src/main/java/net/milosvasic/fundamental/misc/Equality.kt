package net.milosvasic.fundamental.misc

/**
 * Created by milosvasic on 8/8/16.
 */
data class TestEquality(val a: String, val b: Int) {
}

fun equalityExample(){
    val a = TestEquality("Some string", 2)
    val b = TestEquality("Some string", 2)
    val c = a

    println("a === b: ${ a === b }")
    println("a === c: ${ a === c }")
    println("a !== b: ${ a !== b }") // Not equal by reference
    println("a !== c: ${ a !== c }") // Not equal by reference

    println("a == b: ${ a == b }")
    println("a == c: ${ a == c }")
}
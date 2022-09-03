package net.milosvasic.fundamental.kotlin.basics.operators

fun main() {

    var a = 3
    var b = 5
    println("a: $a, b: $b")

    a += b // Is equivalent to: a = a + b, translates to: a.plusAssign(b)
    println("a += b: $a")

    b -= a // Is equivalent to: a = a - b, translates to: a.minusAssign(b)
    println("b -= a: $b")

    a *= b // Is equivalent to: a = a * b, translates to: a.timesAssign(b)
    println("a *= b: $a")

    a /= b // Is equivalent to: a = a / b, translates to: a.divAssign(b)
    println("a /= b: $a")

    a %= b // Is equivalent to: a = a % b, translates to: a.modAssign(b)
    println("a %= b: $a")
}
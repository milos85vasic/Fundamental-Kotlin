package net.milosvasic.fundamental.kotlin.basics.operators

fun main() {

    val a = 1
    val b = 2
    val c = 3
    val d = 4

    // 'Or' examples:
    val or1 = (a > b) || (c > d)
    val or2 = (a < b) || (c < d)
    val or3 = (a == b) || (c == d)
    val or4 = (a == b) || (c == d) || (a == c)

    println("($a > $b) || ($c > $d) -> $or1")
    println("($a < $b) || ($c < $d) -> $or2")
    println("($a == $b) || ($c == $d) -> $or3")
    println("($a == $b) || ($c == $d) || ($a == $c) -> $or4")

    // 'And' examples:
    val and1 = (a > b) && (c > d)
    val and2 = (a < b) && (c < d)
    val and3 = (a == b) && (c == d)
    val and4 = (a == b) && (c == d) && (a == c)

    println("($a > $b) && ($c > $d) -> $and1")
    println("($a < $b) && ($c < $d) -> $and2")
    println("($a == $b) && ($c == $d) -> $and3")
    println("($a == $b) && ($c == $d) && ($a == $c) -> $and4")

    // Mixed example
    val mixed = ((a < b) || (c < d)) && (a != c)
    println("(($a < $b) || ($c < $d)) && ($a != $c) -> $mixed")
}
package net.milosvasic.fundamental.kotlin.basics.functions

fun main() {

    val lambda1: (Int, Int) -> Int = { x, y -> x + y }

    val lambda2 = { x: Int, y: Int -> x + y }

    fun calculator(calculation: (Int, Int) -> Int, a: Int, b: Int) = calculation(a, b)

    val a = 1
    val b = 2
    val c = lambda1(a, b)
    val d = lambda2(a, b)
    val e = calculator(lambda1, a, b)
    val f = calculator(lambda2, a, b)

    println("a + b with lambda1: $c")
    println("a + b with lambda2: $d")
    println("calculator with a, b and lambda1: $e")
    println("calculator with a, b and lambda2: $f")
}
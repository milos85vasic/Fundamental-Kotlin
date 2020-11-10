package net.milosvasic.fundamental.kotlin.basics.functions

import java.lang.IllegalArgumentException

fun main() {

    val lambda1: (Int, Int) -> Int = { x, y -> x + y }

    val lambda2 = { x: Int, y: Int -> x + y }

    fun calculator(calculation: (Int, Int) -> Int, a: Int, b: Int) = calculation(a, b)

    @Throws(IllegalArgumentException::class)
    fun calculationProvider(type: Int) = when(type) {

        0 -> lambda1
        1 -> lambda2
        else -> throw IllegalArgumentException("Unknown type: $type")
    }

    @Throws(IllegalArgumentException::class)
    fun calculator2(a: Int, b: Int, calculationType: Int): Int {

        val calculation = calculationProvider(calculationType)
        return calculation(a, b)
    }

    val a = 1
    val b = 2
    val c = lambda1(a, b)
    val d = lambda2(a, b)
    val e = calculator(lambda1, a, b)
    val f = calculator(lambda2, a, b)
    val g = calculator2(a, b, 0)
    val h = calculator2(a, b, 1)


    println("$a + $b with lambda1: $c")
    println("$a + $b with lambda2: $d")
    println("calculator with $a, $b and lambda1: $e")
    println("calculator with $a, $b and lambda2: $f")
    println("calculator2 with $a, $b and calculation type 0: $g")
    println("calculator2 with $a, $b and calculation type 1: $h")
}
package net.milosvasic.fundamental.kotlin.basics.functions

fun main() {

    fun calculate(a: Int, b: Int = 10, c: Int = 20, d: Int = 30): Int {

        return a + b + c
    }

    // We will use all default values for parameters
    // (passing value for 'a' is mandatory):
    calculate(10)

    // We will pass value for every argument of the function:
    calculate(1, 2, 3, 4)

    // We will pass values for 'a' and 'c' arguments,
    // all others will use its default values:
    calculate(100, c = 100)
}
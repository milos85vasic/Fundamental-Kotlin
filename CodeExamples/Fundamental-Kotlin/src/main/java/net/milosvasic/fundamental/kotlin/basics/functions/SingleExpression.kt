package net.milosvasic.fundamental.kotlin.basics.functions

fun main() {

    fun calculate(a: Int, b: Int): Int {

        return a + b
    }

    fun calculateAsSingleExpression(a: Int, b: Int): Int = a + b

    fun calculateAsSingleExpressionShortest(a: Int, b: Int) = a + b
}
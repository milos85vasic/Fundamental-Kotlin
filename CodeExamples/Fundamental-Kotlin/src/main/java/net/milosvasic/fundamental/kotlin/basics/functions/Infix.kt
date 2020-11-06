package net.milosvasic.fundamental.kotlin.basics.functions

import kotlin.math.pow

fun main() {

    infix fun Double.powerPI(x: Int): Double {

        return this.pow(x + Math.PI)
    }

    val array = arrayOf(2.0, 4.0, 6.0, 8.0, 10.0)
    array.forEach {

        val result = it powerPI 5
        println("$it powerPI: $result")
    }
}
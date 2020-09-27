package net.milosvasic.fundamental.kotlin.basics.data_types

import kotlin.jvm.Throws
import kotlin.math.pow

fun main() {

    /**
     * Power if double data type, otherwise throw exception
     */
    @Throws(IllegalArgumentException::class)
    fun power(x: Any): Double {

        if (x is Double) {
            return x.pow(2.0)
        }
        throw IllegalArgumentException("This method deals only with doubles")
    }

    /**
     * Casting into the Double data type
     */
    @Throws(IllegalArgumentException::class)
    fun powerLogger(value: Any) {

        val converted = when (value) {
            is Int -> {

                value.toDouble()
            }
            is Double -> {

                value
            }
            else -> {

                throw IllegalArgumentException("Unsupported data passed: ${value::class.simpleName}")
            }
        }
        val pow = power(converted)
        println("Power of $converted is: $pow")
    }

    val a = 2.0
    val b = 3
    val c = "not a double"

    val aa = power(a)
    println("a power is: $aa")

    try {
        val bb = power(b)
        println("b power is: $bb")
    } catch (e: IllegalArgumentException) {

        println("Error: ${e.message}")
    }

    try {
        val cc = power(c)
        println("c power is: $cc")
    } catch (e: IllegalArgumentException) {

        println("Error: ${e.message}")
    }

    try {

        powerLogger(a)
        powerLogger(b)
        powerLogger(c)
    } catch (e: IllegalArgumentException) {

        println("Error: ${e.message}")
    }
}


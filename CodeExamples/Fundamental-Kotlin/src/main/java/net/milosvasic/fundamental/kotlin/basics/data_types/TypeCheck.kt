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
     * Casts explicitly into the String data type
     */
    fun logger(value: Any) {

        val toPrint: String = value as String
        println("String value: $toPrint")
    }


}


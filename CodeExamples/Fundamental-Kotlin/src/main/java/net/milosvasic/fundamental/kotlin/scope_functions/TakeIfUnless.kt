package net.milosvasic.fundamental.kotlin.scope_functions

fun main() {

    val numbers = listOf(-3, -2, -1, 0, 1, 2, 3)

    numbers.forEach {

        it.takeUnless { it == 0 }
            ?.let { nZero ->

                nZero.takeIf { nZero > 0 }
                    ?.let { pos ->

                        println("Positive, non zero number: $pos")
                    }
            }
    }
}
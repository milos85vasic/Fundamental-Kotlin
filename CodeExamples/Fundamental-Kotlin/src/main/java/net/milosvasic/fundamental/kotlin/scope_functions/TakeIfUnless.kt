package net.milosvasic.fundamental.kotlin.scope_functions

fun main() {

    val numbers = listOf(-3, -2, -1, 0, 1, 2, 3)

    numbers.forEach {

        val notZero = it.takeUnless { it == 0 }
        notZero?.let { nZero ->

            val positive = nZero.takeIf { it > 0 }
            positive?.let { pos ->

                println("Positive, non zero number: $pos")
            }
        }
    }
}
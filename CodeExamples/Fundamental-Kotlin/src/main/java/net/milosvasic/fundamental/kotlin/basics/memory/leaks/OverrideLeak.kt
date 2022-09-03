package net.milosvasic.fundamental.kotlin.basics.memory.leaks

import java.util.*

fun main() {

    // With memory leakage:
    // class Wrapper(var data: Int)

    // Without memory leakage:
    class Wrapper(var data: String) {

        override fun equals(other: Any?): Boolean {
            if (other === this) {

                return true
            }
            if (other !is Wrapper) {

                return false
            }
            return other.data == data
        }

        override fun hashCode(): Int {

            return Objects.hash(data)
        }
    }

    val word = "Kotlin"
    val instances = mutableMapOf<Wrapper, Int>()
    for (x in 0 until 100) {

        instances[Wrapper(word)] = x
    }

    println("Number of ${Wrapper::class.simpleName} instances is: ${instances.size}")
}
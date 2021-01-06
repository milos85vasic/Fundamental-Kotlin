package net.milosvasic.fundamental.kotlin.basics.memory

fun main() {

    class Wrapper(private val value: Int) {

        fun sum(value: Int) {

            val sum = this.value + value
            println("Sum: $sum")
        }
    }

    val wrapper = Wrapper(1)
    wrapper.sum(3)
}
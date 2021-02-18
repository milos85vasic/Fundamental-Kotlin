package net.milosvasic.fundamental.kotlin.basics.controll_flow

fun main() {

    fun example1(numbers: List<Int>, breakAt: Int) {

        numbers.forEach { item ->
            if (item == breakAt) {
                return
            }
            println("Item: $item")
        }
    }

    fun example2(numbers: List<Int>) {

        numbers.forEach myLabel1@{ item ->
            if (item % 2 == 0) return@myLabel1
            println("Item: $item")
        }
    }

    fun example3(numbers: List<Int>) {

        numbers.forEach { item ->
            if (item % 2 == 0) return@forEach
            println("Item: $item")
        }
    }

    fun example4(numbers: List<Int>) {

        numbers.forEach(
            fun(value: Int) {
                if (value % 2 == 0) return
                println("Item: $value")
            }
        )
    }
}

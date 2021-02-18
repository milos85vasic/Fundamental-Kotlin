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

        numbers.forEach myNumbers@{ item ->
            if (item % 2 == 0) {
                return@myNumbers
            }
            println("Item: $item")
        }
    }

    fun example3(numbers: List<Int>) {

        numbers.forEach { item ->
            if (item % 2 == 0) {
                return@forEach
            }
            println("Item: $item")
        }
    }

    fun example4(numbers: List<Int>) {

        numbers.forEach(
            fun(value: Int) {
                if (value % 2 == 0) {
                    return
                }
                println("Item: $value")
            }
        )
    }

    println("Example 1:")
    var numbers = arrayListOf(1, 3, 5, 7, 9)
    example1(numbers, 5)

    println("Example 2:")
    numbers = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    example2(numbers)

    println("Example 3:")
    example3(numbers)

    println("Example 4:")
    numbers = arrayListOf(1, 3, 5, 7, 9)
    example3(numbers)
}

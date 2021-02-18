package net.milosvasic.fundamental.kotlin.basics.controll_flow

fun main() {

    fun returns1(ints: List<Int>, toBreakAt: Int) {
        ints.forEach { item ->
            if (item == toBreakAt) return
            println("Item: $item")
        }
    }

    fun returns2(ints: List<Int>, toBreakAt: Int) {
        ints.forEach myLabel1@{ item ->
            if (item % 2 == 0) return@myLabel1
            println("Item: $item")
        }
    }

    fun returns3(ints: List<Int>, toBreakAt: Int) {
        ints.forEach { item ->
            if (item % 2 == 0) return@forEach
            println("Item: $item")
        }
    }

    fun returns4(ints: List<Int>, toBreakAt: Int) {
        ints.forEach(
            fun(value: Int) {
                if (value % 2 == 0) return
                println("Item: $value")
            }
        )
    }
}

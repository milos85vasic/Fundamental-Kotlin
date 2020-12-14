package net.milosvasic.fundamental.kotlin.basics.collections


fun main() {

    val check: (Int) -> Boolean = { it > 0 }

    fun `has at least one positive`(items: List<Int>): Boolean {

        return items.any(check)
    }

    fun `has all items positive`(items: List<Int>): Boolean {

        return items.all(check)
    }

    fun `number of positive items`(items: List<Int>): Int {

        return items.count(check)
    }
}
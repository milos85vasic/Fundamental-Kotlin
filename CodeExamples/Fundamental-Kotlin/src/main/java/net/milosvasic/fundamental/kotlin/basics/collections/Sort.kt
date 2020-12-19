package net.milosvasic.fundamental.kotlin.basics.collections

fun main(){

    val numbers = listOf(1, 8, 9, 4, 5, 22, 44, 645, 67).sorted()
    val stringNumbers = listOf("1", "-3", "5").sortedBy { it.toInt() }

}

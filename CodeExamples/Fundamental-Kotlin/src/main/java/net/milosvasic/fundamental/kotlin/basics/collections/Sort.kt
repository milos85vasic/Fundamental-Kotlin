package net.milosvasic.fundamental.kotlin.basics.collections

fun main(){

    val numbers = listOf(1, 8, 9, 4, 5, 22, 44, 645, 67).sorted()
    println("Numbers: $numbers")

    val stringNumbers = listOf("1", "-3", "5").sortedBy { it.toInt() }
    println("String numbers: $stringNumbers")

    val userIds = mapOf("admin" to 0, "john.smith" to 35653, "john.doe" to 32455)
    println("User IDs: $userIds")

    val sortedUserIds = userIds.toSortedMap()
    println("Sorted user IDs: $sortedUserIds")
}

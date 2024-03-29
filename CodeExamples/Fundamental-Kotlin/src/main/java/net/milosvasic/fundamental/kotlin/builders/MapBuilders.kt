package net.milosvasic.fundamental.kotlin.builders

fun main(){

    val map1 = mapOf("hello" to "world", "lorem" to "ipsum", "abc" to "def")

    val map2 = mutableMapOf("hello" to "world", "lorem" to "ipsum")
    map2["abc"] = "def"

    val map3 = sortedMapOf("hello" to "world", "lorem" to "ipsum", "abc" to "def")
    val map4 = hashMapOf("hello" to "world", "lorem" to "ipsum", "abc" to "def")
    val map5 = linkedMapOf("hello" to "world", "lorem" to "ipsum", "abc" to "def")

    println("mapOf=$map1")
    println("mutableMapOf=$map2")
    println("sortedMapOf=$map3")
    println("hashMapOf=$map4")
    println("linkedMapOf=$map5")
}
package net.milosvasic.fundamental.kotlin.idioms

/**
 * Created by mvasic on 6/5/16.
 */
// Gives us read only list
fun getList(): List<Int> {
    return listOf(1, 3, 5, 7)
}

// Gives us read only map
fun getMap(): Map<String, Double> {
    return mapOf("EUR" to 123.20, "USD" to 110.34, "CHF" to 111.4)
}

fun printMap(key: String) {
    val map = getMap()
    if (key in map) println(map[key]) else println("There is no such key $key")
}
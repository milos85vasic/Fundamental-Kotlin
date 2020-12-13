package net.milosvasic.fundamental.kotlin.basics.collections

fun main() {

    fun traverse(map: Map<*, *>) {
        map.forEach { (key, value) ->

            println("$key -> $value")
        }
    }

    fun traverse(list: List<Map<*, *>>) {
        list.forEach {

            traverse(it)
            if (list.indexOf(it) != list.lastIndex) {
                println("- - -")
            }
        }
    }

    val maps = listOf(

        mapOf(1 to "First", 2 to "Second"),
        mapOf("John" to "Smith", "John" to "Doe", "Lorem" to "Ipsum"), // <-- '"John" to "Doe"' overwrites
                                                                       // '"John" to "Smith"' pair because of same key:
                                                                       // "John"
        mapOf(1 to true, 2 to false, 3 to false, 4 to true)
    )
    traverse(maps)
}
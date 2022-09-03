package net.milosvasic.fundamental.kotlin.object_oriented

enum class PLANETS {

    EARTH,
    MARS,
    PLUTO
}

fun main() {

    // Returns PLUTO enum item:
    println("Value of: ${PLANETS.valueOf("PLUTO")}")

    try {

        val planetBlah = PLANETS.valueOf("BLAH")
        println("Planet: $planetBlah")
    } catch (e: IllegalArgumentException) {

        println(e.message)
    }

    // values() func. returns array containing all enum items:
    println("Planets count: ${PLANETS.values().size}")
}
package net.milosvasic.fundamental.kotlin.object_oriented

enum class PLANETS {

    EARTH,
    MARS,
    PLUTO
}

fun main(){

    // Returns PLUTO enum item:
    println("Value of: ${PLANETS.valueOf("PLUTO")}")

    try {

        println("Value of: ${PLANETS.valueOf("VENUS")}")
    } catch (e: IllegalArgumentException) {

        println(e.message)
    }

    // values() func. returns array containing all enum items:
    println("Values size: ${PLANETS.values().size}")
}
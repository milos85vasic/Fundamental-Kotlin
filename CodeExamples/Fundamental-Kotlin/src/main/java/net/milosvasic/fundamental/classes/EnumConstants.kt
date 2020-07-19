package net.milosvasic.fundamental.classes

/**
 * Created by mvasic on 7/2/16.
 */
enum class PLANETS {
    EARTH,
    MARS,
    PLUTO
}

fun tryEnumConstantsStuff() {
    // Returns PLUTO enum item:
    println("Value of: ${PLANETS.valueOf("PLUTO")}")

    // Throws exception:
    // println("Value of: ${PLANETS.valueOf("VENUS")}")

    // Returns array containing all enum items.
    println("Values size: ${PLANETS.values().size}")
}
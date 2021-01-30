package net.milosvasic.fundamental.kotlin.basics.object_oriented

fun main() {

    class Coordinate {

        var x: Int = 0
        var y: Int = 0
        var z: Int = 0

        fun print() = println("Coordinate(x=$x, y=$y, z=$z)")
    }

    val center = Coordinate()
    center.print()

    val location = Coordinate()
    location.x = 10
    location.y = 20
    location.z = 30
    location.print()
}

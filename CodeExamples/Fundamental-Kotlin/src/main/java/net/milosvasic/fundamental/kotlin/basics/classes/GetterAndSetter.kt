package net.milosvasic.fundamental.kotlin.basics.classes


fun main() {

    class Coordinate {

        var reposition: Int = 0

        var x: Int = 0
            // get() = field
            set(value) {
                field = reposition(value)
            }

        var y: Int = 0
            // get() = field
            set(value) {
                field = reposition(value)
            }

        var z: Int = 0
            // get() = field
            set(value) {
                field = reposition(value)
            }

        fun print() = println("Coordinate(x=$x, y=$y, z=$z)")

        private fun reposition(param: Int) = param + reposition
    }

    val center = Coordinate()
    center.print()

    val location = Coordinate()
    location.x = 10
    location.y = 20
    location.z = 30
    location.print()
}
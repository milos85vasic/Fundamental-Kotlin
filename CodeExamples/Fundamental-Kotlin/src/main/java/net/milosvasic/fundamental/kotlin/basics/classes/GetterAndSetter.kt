package net.milosvasic.fundamental.kotlin.basics.classes


fun main() {

    class Coordinate {

        var x: Int = 0
            get() = field
            set(value) {
                field = value
            }

        var y: Int = 0
            get() = field
            set(value) {
                field = value
            }

        var z: Int = 0
            get() = field
            set(value) {
                field = value
            }
    }
}
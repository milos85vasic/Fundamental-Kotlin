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

        private fun reposition(param: Int) = param + reposition
    }
}
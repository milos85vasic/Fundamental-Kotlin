package net.milosvasic.fundamental.classes


class GetterSetter {
    var x: Int
        get() = x
        set(value) {
            x = value
        }
    var y: String
        get() = y
        set(value) {
            y = value
        }
    var z: Boolean = true
        private set
        get() = z
}
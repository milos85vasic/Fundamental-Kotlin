package net.milosvasic.fundamental.kotlin.classes

/**
 * Created by milosvasic on 6/8/16.
 */
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
package net.milosvasic.fundamental.kotlin.classes

/**
 * Created by milosvasic on 6/8/16.
 */
open class Engine {
    open fun turnOn() {
        println("Turn on")
    }
}

class SuperEngine : Engine() {
    override fun turnOn() {
        super.turnOn()
        println("Do a special thing!")
    }
}

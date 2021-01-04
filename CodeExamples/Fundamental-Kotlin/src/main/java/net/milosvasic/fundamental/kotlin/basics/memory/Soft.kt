package net.milosvasic.fundamental.kotlin.basics.memory

import java.lang.ref.SoftReference


fun main() {

    class Dummy {

        fun hello() = println("Dummy: ${hashCode()}")
    }

    val dummy = Dummy()

    // We are initializing soft reference
    // by passing a referent as a parameter
    // exactly as we did with weak reference:
    val soft = SoftReference(dummy)

    soft.get()?.hello()

    // Release soft reference:
    soft.clear()

    soft.get()?.hello()
}
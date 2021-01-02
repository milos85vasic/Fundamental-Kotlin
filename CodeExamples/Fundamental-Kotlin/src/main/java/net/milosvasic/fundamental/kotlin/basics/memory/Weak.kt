package net.milosvasic.fundamental.kotlin.basics.memory

import java.lang.ref.WeakReference

fun main() {

    // Referent definition, some 'dummy' class:
    class Dummy {

        // Referent's method:
        fun hello() = println("Dummy: ${hashCode()}")
    }

    // Referent:
    val dummy = Dummy()

    // We are initializing weak reference
    // by passing a referent as a parameter:
    val weak = WeakReference(dummy)

    weak.get()?.hello()

    // Release weak reference:
    weak.clear()

    weak.get()?.hello()
}
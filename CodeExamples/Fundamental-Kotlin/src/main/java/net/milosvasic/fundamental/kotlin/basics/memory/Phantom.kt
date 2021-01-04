package net.milosvasic.fundamental.kotlin.basics.memory

import java.lang.ref.PhantomReference
import java.lang.ref.ReferenceQueue

fun main() {

    class Dummy {

        fun hello() = println("Dummy: ${hashCode()}")
    }

    val dummy = Dummy()
    val queue = ReferenceQueue<Dummy>()
    val phantom = PhantomReference(dummy, queue)

    phantom.get()?.hello()
    phantom.clear()
    phantom.get()?.hello()
}
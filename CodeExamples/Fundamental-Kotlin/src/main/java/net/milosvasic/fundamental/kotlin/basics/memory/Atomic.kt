package net.milosvasic.fundamental.kotlin.basics.memory

import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicReference
import kotlin.system.exitProcess

fun main() {

    // We define some stub class:
    class Dummy

    val d1 = Dummy()
    val d2 = Dummy()

    // Atomic wrapper around the Integer:
    val counter = AtomicInteger()

    // Initially it does not point to any instance:
    val reference = AtomicReference<Dummy>()

    val t1 = Thread {

        println("Time 1: ${System.nanoTime()}")
        // We are setting new reference:
        reference.set(d1)

        // Increment the counter:
        counter.incrementAndGet()
    }

    val t2 = Thread {

        println("Time 2: ${System.nanoTime()}")
        reference.set(d2)
        counter.incrementAndGet()
    }

    // We will use executor which will ensure that t1 completes before t2:
    val executor = Executors.newSingleThreadExecutor()

    // We are sending threads to be executed sequentially:
    executor.execute(t1)
    executor.execute(t2)

    // Wait until both threads complete
    while (counter.get() < 2) {

        Thread.yield()
    }

    // Get the referent:
    val instance = reference.get()

    // Compare by reference:
    println("Is d1: ${d1 === instance}")
    println("Is d2: ${d2 === instance}")

    // Clear the reference:
    reference.set(null)
    exitProcess(0)
}
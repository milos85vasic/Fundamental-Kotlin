package net.milosvasic.fundamental.kotlin.concurrency

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    // We are launching a new coroutine
    // and keep a reference to coroutine’s “Job”:
    val job = launch {

        for (x in 0..5) {

            delay(1000L)
            println("Count: $x")
        }
    }

    println("Start")
    // Wait for coroutine to finish:
    job.join()
    println("End")
}
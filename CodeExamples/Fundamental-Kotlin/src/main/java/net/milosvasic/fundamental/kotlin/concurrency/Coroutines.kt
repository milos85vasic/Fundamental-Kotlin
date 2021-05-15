package net.milosvasic.fundamental.kotlin.concurrency

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    runBlocking {

        // Launch a new coroutine and continue:
        launch {

            for (x in 0..10) {

                // Non-blocking delay for one second
                delay(1000L)
                println("Count no. $x")
            }
        }

        // Main coroutine continues,
        // a previous one is delayed:
        println("Hello Coroutines!")
    }
}
package net.milosvasic.fundamental.kotlin.concurrency

import java.util.concurrent.Executors

fun main() {

    val executor = Executors.newSingleThreadExecutor()

    for (x in 0..10) {

        executor.execute {

            println("Count no. $x")
            // Sleep for one second:
            Thread.sleep(1000)

            if (x == 10) {

                // We terminate the executor:
                executor.shutdown()
            }
        }
    }

    // We wait for the executor to be terminated
    // and to finish all tasks:
    while (!executor.isShutdown) {

        Thread.yield()
    }
}
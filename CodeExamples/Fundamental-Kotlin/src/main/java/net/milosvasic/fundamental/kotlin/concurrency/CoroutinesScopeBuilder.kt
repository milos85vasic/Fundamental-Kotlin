package net.milosvasic.fundamental.kotlin.concurrency

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    fire()
    println("Completed")
}

// 'suspend' means that coroutine can be suspended for the later execution
suspend fun fire() = coroutineScope {

    for (x in 0..3) {

        launch {

            for (y in 0..5) {

                delay(1000L)
                println("Job $x, count no. $y at: ${System.currentTimeMillis()}")
            }
        }
    }

    println("Started")
}
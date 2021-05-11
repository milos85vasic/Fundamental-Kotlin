package net.milosvasic.fundamental.kotlin.concurrency

fun main() {

    class Counter(private val count: Int) : Thread() {

        override fun run() {

            for (x in 0..count) {

                println("Count no. $x")
                // Sleep for one second:
                sleep(1000)
            }
        }
    }

    class Counter2(private val count: Int) : Runnable {

        override fun run() {

            for (x in 0..count) {

                println("Count no. $x (2)")
                // Sleep for one second:
                Thread.sleep(1000)
            }
        }
    }

    val counter = Counter(10)
    counter.start()

    // We will wait until counter finishes:
    while (counter.isAlive) {

        Thread.yield()
    }

    val counter2 = Counter2(10)
    val thread = Thread(counter2)
    thread.start()

    // We will wait until counter finishes:
    while (thread.isAlive) {

        Thread.yield()
    }
}
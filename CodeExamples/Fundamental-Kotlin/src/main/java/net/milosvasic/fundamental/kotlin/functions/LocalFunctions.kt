package net.milosvasic.fundamental.kotlin.functions

/**
 * Created by mvasic on 7/20/16.
 */
fun worker() {
    fun doWork(work: String) {
        println("Working [ $work ]")
    }

    doWork("Importing user data")
    doWork("Processing user data")
    doWork("Exporting user data")
}
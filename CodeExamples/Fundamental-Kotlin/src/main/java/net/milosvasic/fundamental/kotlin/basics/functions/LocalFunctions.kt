package net.milosvasic.fundamental.kotlin.basics.functions

fun main() {

    fun worker(vararg jobs: String) {

        fun doWork(work: String) {

            println("Job '$work' is starting")
            println("Job '$work' is executing")
            println("Job '$work' is completed")
        }

        jobs.forEach {

            doWork(it)
            println("- - - - - - - - - - - - - - - - - -")
        }
    }

    worker(
            "Importing user data",
            "Processing user data",
            "Exporting user data"
    )
}
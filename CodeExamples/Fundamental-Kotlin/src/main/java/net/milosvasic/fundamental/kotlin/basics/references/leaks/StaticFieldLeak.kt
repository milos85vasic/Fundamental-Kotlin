package net.milosvasic.fundamental.kotlin.basics.references.leaks

val staticList = mutableListOf<Double>()

fun main() {

    fun populate() {

        for (x in 0 until 100 * 1000 * 1000) {
            staticList.add(x.toDouble())
        }
    }

    fun printMemoryStats() {

        val heapSize = Runtime.getRuntime().totalMemory()
        println("Heap size: $heapSize")
    }

    printMemoryStats()

    println("Populating static list")
    populate()

    printMemoryStats()

    println("Executing garbage collection")
    Runtime.getRuntime().gc()

    printMemoryStats()
}
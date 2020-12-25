package net.milosvasic.fundamental.kotlin.basics.references.leaks

val staticList = mutableListOf<Double>()

fun main() {

    fun populate() {
        for (x in 0 until 100 * 1000 * 1000) {
            staticList.add(x.toDouble())
        }
    }

    var memory = Runtime.getRuntime().freeMemory()
    println("Free memory (1): $memory")

    println("Populating static list")
    populate()
    memory = Runtime.getRuntime().freeMemory()
    println("Free memory (2): $memory")

    println("Executing garbage collection")
    Runtime.getRuntime().gc()

    memory = Runtime.getRuntime().freeMemory()
    println("Free memory (3): $memory")
}
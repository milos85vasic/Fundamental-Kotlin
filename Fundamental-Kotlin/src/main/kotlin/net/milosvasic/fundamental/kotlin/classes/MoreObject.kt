package net.milosvasic.fundamental.kotlin.classes

/**
 * Created by mvasic on 7/3/16.
 */
// It is crucial to be 'open'!
open class Computer(cpuCores: Int, memoryInGigabytes: Int) {
    open val cores: Int = cpuCores
    open val memory: Int = memoryInGigabytes
}

interface Gpu {
    fun displayImage()
}

interface SoundCard {
    fun playSound()
}

fun tryMoreObject() {
    val myComputer = object : Computer(8, 64), Gpu, SoundCard {
        override fun displayImage() {
            println("Displaying image.")
        }

        override fun playSound() {
            println("Playing sound")
        }
    }

    println("My computer [ cpu cores: ${myComputer.cores} ][ memory: ${myComputer.memory}GB ]")
    myComputer.displayImage()
    myComputer.playSound()
}
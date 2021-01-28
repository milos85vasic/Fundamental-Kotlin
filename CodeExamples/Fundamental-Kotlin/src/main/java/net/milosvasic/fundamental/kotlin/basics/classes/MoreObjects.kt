package net.milosvasic.fundamental.kotlin.basics.classes

interface Gpu {
    fun displayImage()
}

interface SoundCard {
    fun playSound()
}

open class Computer(cpuCores: Int, memoryInGigabytes: Int) {

    open val cores: Int = cpuCores
    open val memory: Int = memoryInGigabytes
}

fun main() {

    val myComputer = object : Computer(8, 64), Gpu, SoundCard {

        override fun displayImage() {

            println("Displaying image.")
        }

        override fun playSound() {

            println("Playing sound")
        }
    }

    println("Cpu cores: ${myComputer.cores}, memory: ${myComputer.memory}GB")
    myComputer.displayImage()
    myComputer.playSound()
}
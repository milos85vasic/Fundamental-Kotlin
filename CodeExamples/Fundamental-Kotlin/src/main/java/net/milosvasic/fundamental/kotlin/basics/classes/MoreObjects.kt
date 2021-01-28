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

    val computer1 = object : Computer(4, 32), Gpu, SoundCard {

        override fun displayImage() {

            println("Displaying image")
        }

        override fun playSound() {

            println("Playing sound")
        }
    }

    val computer2 = object : Computer(8, 64), Gpu, SoundCard {

        override fun displayImage() {

            println("Performing hardware processing")
            println("Displaying image")
        }

        override fun playSound() {

            println("Perform sound equalization")
            println("Playing sound")
        }
    }

    listOf(computer1, computer2).forEach {

        println("Cpu cores: ${it.cores}, memory: ${it.memory}GB")
        it.displayImage()
        it.playSound()
    }
}
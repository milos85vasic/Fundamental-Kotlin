package net.milosvasic.fundamental.kotlin.basics.object_oriented

import java.net.URL

interface Process {

    val cores: Int

    val memory: Int
        get() = 64

    fun execute()

    fun getUsedResources() = "cores=$cores, memory=$memory"
}

fun main() {

    class Download(val what: URL) : Process {

        override val cores: Int
            get() = 4

        override fun execute() {

            println("Downloading: $what, using(${getUsedResources()})")
        }
    }

    class Encrypt(val what: String) : Process {

        override val cores: Int
            get() = 8

        override val memory: Int
            get() = 128

        override fun execute() {

            println("Encrypting: $what, using(${getUsedResources()})")
        }
    }
}
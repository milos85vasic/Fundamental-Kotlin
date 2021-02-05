package net.milosvasic.fundamental.kotlin.basics.object_oriented

interface Device {

    val model: String
}

interface AudioDevice : Device {

    val brand: String
    val serialNumber: Long

    override val model: String
        get() = "$brand::$serialNumber"

    fun play()
}

class MusicPlayer(
    override val brand: String,
    override val serialNumber: Long
) : AudioDevice {

    override fun play() {

        println("'$model' is playing")
    }
}

fun main() {

    listOf(

        MusicPlayer("Sony", 1241),
        MusicPlayer("Panasonic", 1001001),
        MusicPlayer("Sony", 1242)
    ).forEach {

        it.play()
    }
}
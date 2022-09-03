package net.milosvasic.fundamental.kotlin.object_oriented

enum class CAPABILITIES {

    POWER_ON {
        override fun execute() {
            println("Powering on")
        }
    },
    POWER_OFF {
        override fun execute() {
            println("Powering off")
        }
    },
    MUTE {
        override fun execute() {
            println("Muting audio")
        }
    },
    VOLUME_UP {
        override fun execute() {
            println("Vol +")
        }
    },
    VOLUME_DOWN {
        override fun execute() {
            println("Vol -")
        }
    };

    abstract fun execute()
}

fun main(){

    val capabilities = listOf(

        CAPABILITIES.POWER_ON,
        CAPABILITIES.VOLUME_UP,
        CAPABILITIES.VOLUME_UP,
        CAPABILITIES.VOLUME_DOWN,
        CAPABILITIES.POWER_OFF
    )

    for (capability in capabilities) {
        capability.execute()
    }
}
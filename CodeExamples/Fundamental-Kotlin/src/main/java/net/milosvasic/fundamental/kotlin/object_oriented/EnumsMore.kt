package net.milosvasic.fundamental.kotlin.object_oriented

/**
 * Created by mvasic on 7/2/16.
 */
enum class DEVICE_CAPABILITIES {
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

fun doMoreEnumsStuff() {
    val operations = listOf<DEVICE_CAPABILITIES>(
            DEVICE_CAPABILITIES.POWER_ON,
            DEVICE_CAPABILITIES.VOLUME_UP,
            DEVICE_CAPABILITIES.VOLUME_UP,
            DEVICE_CAPABILITIES.VOLUME_UP,
            DEVICE_CAPABILITIES.POWER_OFF
    )
    for (operation in operations) {
        operation.execute()
    }
}
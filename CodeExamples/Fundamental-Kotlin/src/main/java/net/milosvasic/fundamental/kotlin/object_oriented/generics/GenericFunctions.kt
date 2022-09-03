package net.milosvasic.fundamental.kotlin.object_oriented.generics

fun main() {

    abstract class Engine {

        abstract val power: Long

        override fun toString(): String {

            return "Engine(power=$power)"
        }
    }

    class RocketEngine : Engine() {

        override val power: Long
            get() = 1000
    }

    class TruckEngine : Engine() {

        override val power: Long
            get() = 100
    }

    class EngineDiagnostics {

        fun <T : Engine> checkEngine(engine: T) {

            println(engine)
        }
    }

    val truckEngine = TruckEngine()
    val rocketEngine = RocketEngine()
    val diagnostics = EngineDiagnostics()

    diagnostics.checkEngine(truckEngine)
    diagnostics.checkEngine(rocketEngine)
}



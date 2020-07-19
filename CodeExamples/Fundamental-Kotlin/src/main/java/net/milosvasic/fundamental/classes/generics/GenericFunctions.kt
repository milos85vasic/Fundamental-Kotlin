package net.milosvasic.fundamental.classes.generics

/**
 * Created by mvasic on 6/23/16.
 */
abstract class Engine {
    abstract val power: Long

    override fun toString(): String{
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

fun tryGenericFunctions(){
    val truckEngine = TruckEngine()
    val rocketEngine = RocketEngine()
    val diagnostics = EngineDiagnostics()
    diagnostics.checkEngine(truckEngine)
    diagnostics.checkEngine(rocketEngine)
}



package net.milosvasic.fundamental.kotlin.basics.classes

fun main(){

    open class Engine(protected val model: String) {

        open fun turnOn() = println("$model: Turning on")

        open fun turnOff() = println("$model: Turning off")
    }

    class CarEngine(model: String) : Engine(model) {

        override fun turnOn() {

            super.turnOn()
            println("$model: Car is starting")
        }

        override fun turnOff() {

            super.turnOff()
            println("$model: Car is stopping")
        }
    }

    class CustomEngine(model: String) : Engine(model) {

        // We override just 'turnOn' function for this class:
        override fun turnOn() {

            // We don't want super class business logic,
            // so we do not call 'super':
            println("$model: Car is starting")
        }
    }

    val carEngine = CarEngine("Fiat")
    carEngine.turnOn()
    carEngine.turnOff()

    val customEngine = CustomEngine("Rocket")
    customEngine.turnOn()
    customEngine.turnOff()

    open class TruckEngine(model: String) : Engine(model) {

        final override fun turnOn() {

            println("$model: Preparing")
            super.turnOn()
            println("$model: Engine is running")
        }

        final override fun turnOff() {

            println("$model: Preparing")
            super.turnOff()
            println("$model: Engine has stopped")
        }
    }

    class Scania : TruckEngine("Scania"){

        // We cannot override 'turnOn' and 'turnOff' functions
        // since they are marked with 'final override'
    }
}

package net.milosvasic.fundamental.kotlin.basics.classes

fun main(){

    open class Engine(protected val model: String) {

        open fun turnOn() = println("$model: Turn on")

        open fun turnOff() = println("$model: Turn off")
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
}

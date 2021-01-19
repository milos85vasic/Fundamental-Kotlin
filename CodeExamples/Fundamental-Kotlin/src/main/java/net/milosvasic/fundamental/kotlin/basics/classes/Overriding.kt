package net.milosvasic.fundamental.kotlin.basics.classes

fun main(){

    open class Engine {

        open fun turnOn() = println("Turn on")

        open fun turnOff() = println("Turn off")
    }

    class CarEngine : Engine() {

        override fun turnOn() {

            super.turnOn()
            println("Car is starting")
        }

        override fun turnOff() {

            super.turnOff()
            println("Car is stopping")
        }
    }

    class CustomEngine : Engine() {

        override fun turnOn() {

            // No call for the 'super'
            println("Car is starting")
        }

        // We will not override 'turnOff' function for this class
    }

    val carEngine = CarEngine()
    carEngine.turnOn()
    carEngine.turnOff()

    val customEngine = CustomEngine()
    customEngine.turnOn()
    customEngine.turnOff()
}

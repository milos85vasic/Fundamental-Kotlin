package net.milosvasic.fundamental.kotlin.object_oriented.generics

fun main() {

    abstract class Airplane {

        abstract fun describe()
    }

    class Boeing : Airplane() {

        override fun describe() {
            println("Being")
        }
    }

    class Airbus : Airplane() {

        override fun describe() {
            println("Airbus")
        }l
    }

    class AirplaneDescriptor {

        fun <T : Airplane> describe(airplane: T) {
            airplane.describe()
        }
    }

    val airplane1 = Airbus()
    val airplane2 = Boeing()
    val descriptor = AirplaneDescriptor()

    descriptor.describe(airplane1)
    descriptor.describe(airplane2)
}

package net.milosvasic.fundamental.kotlin.object_oriented.generics

fun main() {

    abstract class Airplane {

        abstract fun describeMe()
    }

    class Boeing : Airplane() {

        override fun describeMe() {
            println("Being")
        }
    }

    class Airbus : Airplane() {

        override fun describeMe() {
            println("Airbus")
        }
    }

    class AirplaneDescriptor {

        fun <T : Airplane> describeMe(airplane: T) {
            airplane.describeMe()
        }
    }

    val airplane1 = Airbus()
    val airplane2 = Boeing()
    val descriptor = AirplaneDescriptor()

    descriptor.describeMe(airplane1)
    descriptor.describeMe(airplane2)
}

package net.milosvasic.fundamental.kotlin.object_oriented.generics

fun main(){

    abstract class Airplane {

        abstract fun decribeMe();
    }

    class Boeing : Airplane() {

        override fun decribeMe() {
            println("Being")
        }
    }

    class Airbus : Airplane() {

        override fun decribeMe() {
            println("Airbus")
        }
    }

    class AirplaneDescriptor {

        fun <T : Airplane> describe(airplane: T) {
            airplane.decribeMe()
        }
    }

    val airplane1 = Airbus()
    val airplane2 = Boeing()
    val descriptor = AirplaneDescriptor()

    descriptor.describe(airplane1)
    descriptor.describe(airplane2)
}

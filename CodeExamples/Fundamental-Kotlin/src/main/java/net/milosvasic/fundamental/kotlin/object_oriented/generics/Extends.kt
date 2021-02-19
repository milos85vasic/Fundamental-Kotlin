package net.milosvasic.fundamental.kotlin.object_oriented.generics

/**
 * Created by mvasic on 7/2/16.
 */
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

fun tryExtendsExample(){
    val airplane1 = Airbus()
    val airplane2 = Boeing()
    val descriptor = AirplaneDescriptor()

    descriptor.describe(airplane1)
    descriptor.describe(airplane2)
}

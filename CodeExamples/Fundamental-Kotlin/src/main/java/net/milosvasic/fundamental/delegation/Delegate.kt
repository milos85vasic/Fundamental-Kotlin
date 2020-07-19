package net.milosvasic.fundamental.delegation

/**
 * Created by mvasic on 7/4/16.
 */
interface Flying {
    fun fly()
}

class Plane : Flying {
    override fun fly() {
        println("PLANE")
    }
}

class Zeppelin : Flying {
    override fun fly() {
        println("ZEPPELIN")
    }
}

class Traveling(fly: Flying) : Flying by fly {
}

fun delegateExample() {
    val plane = Plane()
    val zeppelin = Zeppelin()

    val travelByPlane = Traveling(plane)
    val travelByZeppelin = Traveling(zeppelin)

    travelByPlane.fly()
    travelByZeppelin.fly()
}
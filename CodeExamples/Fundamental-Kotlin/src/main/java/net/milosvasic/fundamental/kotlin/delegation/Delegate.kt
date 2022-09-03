package net.milosvasic.fundamental.kotlin.delegation

interface Flying {

    fun fly()
}

fun main() {

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

    class Traveling(fly: Flying) : Flying by fly

    val plane = Plane()
    val zeppelin = Zeppelin()

    val travelByPlane = Traveling(plane)
    val travelByZeppelin = Traveling(zeppelin)

    travelByPlane.fly()
    travelByZeppelin.fly()
}
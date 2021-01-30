package net.milosvasic.fundamental.kotlin.basics.object_oriented

interface Vehicle {

    fun startEngine()

    fun stopEngine()

    fun drive()
}

open class Car : Vehicle {

    override fun startEngine() {

        println("start")
    }

    override fun stopEngine() {

        println("stop")
    }

    override fun drive() {

        println("drive")
    }
}

class Mercedes(private val model: String) : Car() {

    override fun startEngine() {

        super.startEngine()
        println("$model: start")
    }

    override fun stopEngine() {

        super.stopEngine()
        println("$model: stop")
    }

    override fun drive() {

        super.drive()
        println("$model: drive")
    }
}

fun main() {

    val m1 = Mercedes("Mercedes-Benz AMG A 35")
    val m2 = Mercedes("Mercedes-Benz AMG C 63")
    val m3 = Mercedes("Mercedes-Benz AMG C 63 S")
    val m4 = Mercedes("Mercedes-Benz CLA 250")

    val scooter = object : Vehicle {

        override fun startEngine() {

            println("Scooter: start")
        }

        override fun stopEngine() {

            println("Scooter: stop")
        }

        override fun drive() {

            println("Scooter: drive")
        }
    }

    val vehicles = listOf(m1, m2, m3, m4, scooter)

    vehicles.forEach {

        it.startEngine()
        it.drive()
        it.stopEngine()
        println()
    }
}
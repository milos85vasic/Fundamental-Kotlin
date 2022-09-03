package net.milosvasic.fundamental.kotlin.basics.collections

fun main() {

    class Vehicle(val name: String)

    val cars = listOf(

        Vehicle("Bmw"),
        Vehicle("Mercedes"),
        Vehicle("Toyota")
    )

    val busses = listOf(

        Vehicle("Solaris"),
        Vehicle("Champion"),
        Vehicle("Ikarbus")
    )

    val vehicles = listOf(cars, busses)
    val manufacturers = vehicles.flatten().map {
        it.name
    }

    println(manufacturers)
    println(manufacturers.sorted())
}
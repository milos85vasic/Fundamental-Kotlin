package net.milosvasic.fundamental.kotlin.basics.classes

fun main() {

    // Inherits Any
    open class Human

    // Indian extends Human
    class Indian : Human()

    // Class with non-empty constructor
    open class Vehicle(type: String)

    // Truck extends Vehicle and it's constructor
    class Truck(type: String) : Vehicle(type)

    // Train extends Vehicle but has empty constructor. Value is passed to parent constructor.
    class Train : Vehicle("Civil")

    // Another way to extend class
    class Bus : Vehicle {
        constructor(type: String) : super(type)
    }
}

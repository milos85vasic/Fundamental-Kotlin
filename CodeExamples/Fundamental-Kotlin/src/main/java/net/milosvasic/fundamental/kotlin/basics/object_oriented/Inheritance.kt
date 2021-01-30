package net.milosvasic.fundamental.kotlin.basics.object_oriented

fun main() {

    // Class 'Human' Inherits  by default: 'Any':
    open class Human

    // Class 'Indian' inherits Human:
    class Indian : Human()

    // Class with non-empty constructor:
    open class Vehicle(type: String)

    // Class 'Truck' inherits 'Vehicle' and it's constructor:
    class Truck(type: String) : Vehicle(type)

    // Class 'Train' inherits class 'Vehicle'
    // but it has empty constructor. Value is passed to the parent constructor:
    class Train : Vehicle("Civil")

    // Another way to inherit class"
    class Bus : Vehicle {

        // Constructor goes here:
        constructor(type: String) : super(type)

        init {

            // Your special initialization code
            // ...
        }
    }
}

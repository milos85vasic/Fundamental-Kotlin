package net.milosvasic.fundamental.kotlin.basics.classes

fun main() {

    // Simple class definition:
    class Dummy {}

    // If there is no body like in previous example, we can omit braces:
    class NoBody

    // Class 'Car' with primary constructor that accepts one argument:
    class Car constructor(val brand: String)

    // 'constructor' keyword is omitted for primary constructor:
    class Plane(val brand: String)

    class Calculator(val parameter: Int, val calculatedValue: Int = parameter * 2)

    class NotPublicConstructed private constructor(val name: String){
        // ...
    }

    class Person(val name: String) {

        constructor(name: String, year: Int) : this(name)

        constructor(name: String, year: Int, height: Int) : this(name)
    }

    val d1 = Dummy()
    val d2 = Dummy()
    val d3 = Dummy()

    val nbd1 = NoBody()
    val nbd2 = NoBody()
    val nbd3 = NoBody()

    val car = Car("BMW")
    val car2 = Car("Mercedes")
    val plane = Plane("Boeing")

}
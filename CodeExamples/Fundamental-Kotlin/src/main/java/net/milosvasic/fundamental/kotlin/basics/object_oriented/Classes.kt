package net.milosvasic.fundamental.kotlin.basics.object_oriented

fun main() {

    // Simple class definition:
    class Dummy {}

    // If there is no body like in previous example, we can omit braces:
    class NoBody

    // Class 'Car' with primary constructor that accepts one argument:
    class Car constructor(val brand: String)

    // 'constructor' keyword is omitted for primary constructor:
    class Plane(val brand: String)

    /*
        class Calculator(val parameter1: Int) {

            val parameter2: Int
            init {

                parameter2 = parameter1 * 2
            }
        }
    */
    // Simplified version of the class:
    class Calculator(val parameter1: Int, val parameter2: Int = parameter1 * 2)

    class NotPublicConstructed private constructor(val name: String){

        // ...
    }

    class Person(val name: String) {

        constructor(name: String, year: Int) : this(name) // ← 'this(...)' calls primary constructor

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

    val calc = Calculator(2)
    val calc2 = Calculator(3)
    val calc3 = Calculator(2, 4)
    val calc4 = Calculator(3, 5)

    println("${calc.parameter1}, ${calc.parameter2}")
    println("${calc2.parameter1}, ${calc2.parameter2}")
    println("${calc3.parameter1}, ${calc3.parameter2}")
    println("${calc4.parameter1}, ${calc4.parameter2}")

    val person1 = Person("John Smith")
    val person2 = Person("John Doe", 1985)
    val person3 = Person("John SomeOther", 1987, 190)
}
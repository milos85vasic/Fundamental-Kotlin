package net.milosvasic.fundamental.classes

// Simple class definition
class Dummy {}

// If there is no body like in previous example
class NoBody

class Car constructor(val brand: String)

class Plane(val brand: String)

class Calculator(val parameter: Int, val calculatedValue: Int = parameter * 2)

class NotPublicConstructed private constructor(val name: String){
    // ...
}

class Person(val name: String) {

    constructor(name: String, year: Int) : this(name)

    constructor(name: String, year: Int, height: Int) : this(name)

}

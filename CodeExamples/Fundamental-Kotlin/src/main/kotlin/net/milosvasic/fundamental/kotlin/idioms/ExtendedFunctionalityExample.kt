package net.milosvasic.fundamental.kotlin.idioms

/**
 * Created by mvasic on 6/5/16.
 */
class Employee {
    fun name(): String {
        return "Employee name"
    }
}

class ExtendedFunctionalityExample(val e: Employee) {
    // We extended Employee class with function that does not exist in original class!
    fun Employee.age(): Int {
        return 25
    }

    fun tryExtendedEmployeeExample() {
        println("Name: ${e.name()}, Age: ${e.age()}")
    }
}
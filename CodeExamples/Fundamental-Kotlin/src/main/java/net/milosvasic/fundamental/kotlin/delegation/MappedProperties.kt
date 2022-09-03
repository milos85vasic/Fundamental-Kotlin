package net.milosvasic.fundamental.kotlin.delegation

fun main(){

    class Employee(map: Map<String, Any?>) {

        val firstName: String by map
        val lastName: String by map
        val yearOfBirth: Int by map
    }

    val e = Employee(

        mapOf(

            "firstName" to "John",
            "lastName" to "Smith",
            "yearOfBirth" to 1985
        )
    )

    println("Employee: ${e.firstName}, ${e.lastName}, ${e.yearOfBirth}")
}
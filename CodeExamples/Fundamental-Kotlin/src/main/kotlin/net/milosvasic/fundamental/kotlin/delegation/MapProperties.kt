package net.milosvasic.fundamental.kotlin.delegation

/**
 * Created by mvasic on 7/19/16.
 */
class Employee(val map: Map<String, Any?>) {
    val firstName: String by map
    val lastName: String by map
    val yearOfBirth: Int by map
}

fun tryMapProperties() {
    val e = Employee(
            mapOf(
                    "firstName" to "John",
                    "lastName" to "Smith",
                    "yearOfBirth" to 1985
            )
    )

    println("Employee [ ${e.firstName} ${e.lastName} ][ ${e.yearOfBirth} ]")
}
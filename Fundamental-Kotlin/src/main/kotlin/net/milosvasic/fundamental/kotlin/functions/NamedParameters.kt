package net.milosvasic.fundamental.kotlin.functions

/**
 * Created by mvasic on 7/20/16.
 */

fun addEmployee(name: String, year: Int, address: String) {
}

// Let's call method:
fun namedParametersExaple() {
    addEmployee(
            name = "John Smith",
            year = 1985,
            address = "Avenue 666"
    )
}

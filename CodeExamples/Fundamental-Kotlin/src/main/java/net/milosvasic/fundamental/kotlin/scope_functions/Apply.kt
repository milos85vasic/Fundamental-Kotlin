package net.milosvasic.fundamental.kotlin.scope_functions

fun main() {

    class User {

        var firstName = ""
        var lastName = ""
        var address = ""
        var email = ""
    }

    val user = User().apply {

        firstName = "John"
        lastName = "Smith"
        address = "5th Avenue"
        email = "john.smith@example.com"
    }

    println(user)
}
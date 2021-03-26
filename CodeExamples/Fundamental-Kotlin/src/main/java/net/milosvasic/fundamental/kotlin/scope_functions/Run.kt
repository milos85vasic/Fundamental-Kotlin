package net.milosvasic.fundamental.kotlin.scope_functions

fun main() {

    class User {

        var firstName = ""
        var lastName = ""
        var address = ""
        var email = ""
    }

    val user = User()
    user.run {

        firstName = "John"
        lastName = "Smith"
        address = "5th Avenue"
        email = "john.smith@example.com"
    }

    val example = run {

        val param1 = "Hello world"
        val param2 = "Lorem ipsum"
        val param3 = "Something else"

        "$param1, $param2, $param3"
    }

    println(example)
}
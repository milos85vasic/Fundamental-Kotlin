package net.milosvasic.fundamental.kotlin.basics.classes

fun main() {

    data class User(val name: String, val age: Int)

    listOf(

        User("John Doe", 40),
        User("John Lord", 45),
        User("John Smith", 35)
    ).forEach {

        println("User: $it")
    }
}
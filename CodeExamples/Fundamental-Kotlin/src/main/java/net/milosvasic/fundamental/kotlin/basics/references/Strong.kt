package net.milosvasic.fundamental.kotlin.basics.references

fun main() {

    data class Wrapper(val what: Any)

    val number = 1                   // <- Default (strong) reference
    val wrapper = Wrapper(100) // <- Default (strong) reference

    var number2: Int? = null         // <- Default (strong) reference
    var wrapper2: Wrapper? = null    // <- Default (strong) reference
}
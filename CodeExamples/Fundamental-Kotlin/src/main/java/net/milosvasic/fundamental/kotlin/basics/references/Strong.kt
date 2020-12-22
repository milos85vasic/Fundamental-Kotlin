package net.milosvasic.fundamental.kotlin.basics.references

fun main() {

    data class Wrapper(val what: Any)

    val number = 1
    val wrapper = Wrapper(100) // <- Default (strong) reference
}
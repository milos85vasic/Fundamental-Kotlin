package net.milosvasic.fundamental.kotlin.syntax

fun main() {

    val global = "Global"

    fun scopes() {

        val local = "Local"

        // We can access to global scope:
        println("Local: $local")
        println("Global: $global")
    }

    // We can access to local scope, compiler would complain:
    // println("Local: $local")
    println("Global: $global")
}
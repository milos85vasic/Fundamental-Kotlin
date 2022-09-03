package net.milosvasic.fundamental.kotlin.annotations

fun main() {

    val lambda = @Marker { println("Do something ...") }
    lambda()
}
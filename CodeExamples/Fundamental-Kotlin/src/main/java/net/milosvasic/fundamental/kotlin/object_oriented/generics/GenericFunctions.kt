package net.milosvasic.fundamental.kotlin.object_oriented.generics


fun main() {

    fun <T> genericFunctionsExample(x: T) {

        println("Value: $x")
    }

    genericFunctionsExample(5)
    genericFunctionsExample("Some word!")
    genericFunctionsExample('c')
    genericFunctionsExample(5.55)
}

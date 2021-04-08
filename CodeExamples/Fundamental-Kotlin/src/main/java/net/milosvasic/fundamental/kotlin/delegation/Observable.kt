package net.milosvasic.fundamental.kotlin.delegation

import kotlin.properties.Delegates


fun main(){

class Example {

    val default = "No value"

    var value: String by Delegates.observable(default) {
            property, oldValue, newValue ->

        println("${property.name}: old='$oldValue', new='$newValue'")
    }
}

    val observe = Example()
    observe.value = "Hello world!"
    observe.value = "Lorem ipsum..."
    observe.value = "And so on..."
}

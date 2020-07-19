package net.milosvasic.fundamental.delegation

import kotlin.properties.Delegates

/**
 * Created by mvasic on 7/19/16.
 */
class ObservableExample {
    var toBeDelegated: String by Delegates.observable("Initial value!") {
        property, oldValue, newValue ->
        println("[ old: $oldValue ][ new: $newValue ]")
    }
}

fun observeValueChanges(){
    val observe = ObservableExample()
    observe.toBeDelegated = "Some new value"
    observe.toBeDelegated = "And some more..."
    observe.toBeDelegated = "And more... ;)"
}

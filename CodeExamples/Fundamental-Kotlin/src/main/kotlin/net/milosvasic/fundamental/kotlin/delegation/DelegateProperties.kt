package net.milosvasic.fundamental.kotlin.delegation

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class ToBeDelegated() {
    var value: Int by Delegator()
}

/*
 * ReadWriteProperty:
 * Base interface that can be used for implementing property delegates of read-write properties.
 */
class Delegator() : ReadWriteProperty<Any, Int> {
    var value = 0

    override fun getValue(thisRef: Any, property: KProperty<*>): Int {
        println("Value [ GET ][ ${property.name} ]")
        return value
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Int) {
        println("Value [ SET ][ ${property.name} ][ ${value} ]")
        this.value = value
    }
}

fun tryPropertiesDelegate() {
    val x = ToBeDelegated()
    val y = ToBeDelegated()
    val z = ToBeDelegated()

    x.value = 100
    y.value = 200
    z.value = 300
    println("- - - - - - - - - - - - - - - - - - ")
    println("x's val: ${x.value}")
    println("y's val: ${y.value}")
    println("z's val: ${z.value}")
}

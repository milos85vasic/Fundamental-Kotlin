package net.milosvasic.fundamental.kotlin.classes

/**
 * Created by milosvasic on 6/8/16.
 */
class WorkWithProperties {
    var x: Int = 0;
    var y: Int? = null
    val z: Int = 1
}

fun accessProperties(){
    val w = WorkWithProperties()
    w.y = 10

    val x = w.x
    val y = w.y
    val z = w.z
}

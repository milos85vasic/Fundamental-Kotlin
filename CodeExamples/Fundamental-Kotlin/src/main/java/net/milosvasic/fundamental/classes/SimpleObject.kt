package net.milosvasic.fundamental.classes

/**
 * Created by mvasic on 7/3/16.
 */
fun simpleObjectExample(){
    val obj = object {
        var x = 0
        var y = 1
    }

    println("Object [ ${obj.x} ][ ${obj.y} ]")
    obj.x = 10
    obj.y = 11
    println("Object [ ${obj.x} ][ ${obj.y} ]")
}

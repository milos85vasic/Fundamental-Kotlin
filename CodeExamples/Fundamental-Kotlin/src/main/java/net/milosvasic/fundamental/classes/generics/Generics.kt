package net.milosvasic.fundamental.classes.generics

/**
 * Created by milosvasic on 6/9/16.
 */
class Container<T>(val data: T) {
    fun printIt(){
        println("We have value [ $data ]")
    }
}

fun tryGenerics(){
    val data1 = Container(1)
    val data2 = Container("Some string")
    val data3 = Container(true)
    data1.printIt()
    data2.printIt()
    data3.printIt()
}

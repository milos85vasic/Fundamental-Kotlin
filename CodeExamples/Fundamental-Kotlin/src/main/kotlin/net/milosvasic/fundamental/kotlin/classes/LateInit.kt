package net.milosvasic.fundamental.kotlin.classes

/**
 * Created by milosvasic on 6/8/16.
 */
class SomeExampleClass {
    fun printMe() {
        println("I am late initialized!")
    }
}

class TryLateInit {
    lateinit var x: SomeExampleClass

    fun printMe() {
        x = SomeExampleClass()
        x.printMe()
    }
}

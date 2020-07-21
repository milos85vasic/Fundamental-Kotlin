package net.milosvasic.fundamental.kotlin.classes

class SomeExampleClass {
    fun printMe() {
        println("I am late initialized!")
    }
}

class Late {
    lateinit var x: SomeExampleClass

    fun printMe() {
        x = SomeExampleClass()
        x.printMe()
    }
}

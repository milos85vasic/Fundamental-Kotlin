package net.milosvasic.fundamental.kotlin.object_oriented

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

package net.milosvasic.fundamental.kotlin.classes.extensions

/**
 * Created by milosvasic on 6/9/16.
 */
class Parent {
    fun doSomething() {
        println("Do something...")
    }
}

class MyClass {
    fun Parent.doSomething() {
        this.doSomething()
        println("And the extended part.")
    }

    fun Parent.doSomething(x: Int) {
        println("Extended with parameter passed")
    }

    fun Parent.newStuff() {
        println("Extended with new method")
    }

    fun tryExtensions(parent: Parent) {
        with(parent) {
            doSomething()
            doSomething(5)
            newStuff()
        }
    }
}

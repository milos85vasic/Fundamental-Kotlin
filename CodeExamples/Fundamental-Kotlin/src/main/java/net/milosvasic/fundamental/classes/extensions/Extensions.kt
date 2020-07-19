package net.milosvasic.fundamental.classes.extensions


class Parent {
    fun doSomething() {
        println("Do something...")
    }
}

class Child {
    fun Parent.doSomething() {
        this.doSomething()
        println("And the extended it.")
    }

    fun Parent.doSomething(x: Int) {
        println("Extended with parameter passed")
    }

    fun Parent.doSomething2() {
        println("Extended with new method")
    }

    fun tryout(parent: Parent) {
        with(parent) {
            doSomething()
            doSomething(5)
            doSomething2()
        }
    }
}

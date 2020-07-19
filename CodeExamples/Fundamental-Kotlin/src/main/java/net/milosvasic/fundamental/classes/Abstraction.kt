package net.milosvasic.fundamental.classes

/**
 * Created by milosvasic on 6/8/16.
 */
abstract class Animal {
    abstract fun walk()

    fun run(){
        println("run")
    }
}

open class Cat : Animal() {
    override fun walk() {
        println("walk")
    }
}

abstract class BigCat : Cat() {
    override abstract fun walk()
}
package net.milosvasic.fundamental.kotlin.classes

/**
 * Created by mvasic on 7/4/16.
 */
class SingletonExample private constructor() {
    companion object {
        private val instance = SingletonExample()

        fun instance(): SingletonExample = instance
    }

    var x = 0

    fun printX() {
        println("X: ${x}.")
    }
}

fun trySingleton() {
    val example1 = SingletonExample.instance()
    val example2 = SingletonExample.instance()
    val example3 = SingletonExample.instance()

    example1.x = 101

    println("- - - - - - - -")
    example1.printX()
    example2.printX()
    example3.printX()

    example2.x = 202

    println("- - - - - - - -")
    example1.printX()
    example2.printX()
    example3.printX()

    example3.x = 303

    println("- - - - - - - -")
    example1.printX()
    example2.printX()
    example3.printX()
}
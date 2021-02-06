package net.milosvasic.fundamental.kotlin.basics.object_oriented

interface IDummy1 {

    fun doSomething() {

        val hello = hello()
        println(hello)
    }

    fun hello(): String
}

interface IDummy2 {

    fun doSomething() {

        hello().forEach {

            println(it)
        }
    }

    fun hello() = "Hello world"
}

class Dummy1 : IDummy1 {

    override fun hello() = "Lorem ipsum"
}

class Dummy2 : IDummy2

class Dummy3 : IDummy1, IDummy2 {

    override fun doSomething() {

        super<IDummy1>.doSomething()
        super<IDummy2>.doSomething()
    }

    override fun hello(): String {

        return super.hello()
    }
}

fun main() {

    println("Dummy 1:")
    val dummy1 = Dummy1()
    dummy1.doSomething()

    println("Dummy 2:")
    val dummy2 = Dummy2()
    dummy2.doSomething()

    println("Dummy 3:")
    val dummy3 = Dummy3()
    dummy3.doSomething()
}
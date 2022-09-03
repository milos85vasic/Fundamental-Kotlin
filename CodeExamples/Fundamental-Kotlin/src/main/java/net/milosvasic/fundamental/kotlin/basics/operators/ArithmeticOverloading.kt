package net.milosvasic.fundamental.kotlin.basics.operators

class MyCustomType(val param: Int) {

    operator fun plus(what: MyCustomType): MyCustomType {

        return MyCustomType(param + what.param)
    }
}

fun main() {

    val a = MyCustomType(5)
    val b = MyCustomType(10)
    val c = a + b

    println("a + b = ${c.param}")
}
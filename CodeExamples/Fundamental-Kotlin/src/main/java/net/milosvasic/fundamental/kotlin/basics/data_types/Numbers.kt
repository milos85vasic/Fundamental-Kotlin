package net.milosvasic.fundamental.kotlin.basics.data_types

fun numbers() {
    val a: Int = 1 // A is boxed Int (java.lang.Integer)
    var b: Long? = null // We can't pass b directly to a!
    b = a.toLong() // We must convert it!
    println("a: $a") // prints 1
    println("b: $b") // prints 1
    print(a == b.toInt()) // We compare them
}
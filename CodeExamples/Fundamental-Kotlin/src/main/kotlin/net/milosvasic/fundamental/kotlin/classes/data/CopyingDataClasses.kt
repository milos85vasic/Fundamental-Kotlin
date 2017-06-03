package net.milosvasic.fundamental.kotlin.classes.data

/**
 * Created by milosvasic on 6/9/16.
 */
data class Person(val name: String, val age: Int){}

fun tryDataClassCopying(){
    val p = Person("John Smith", 1985)
    val p2 = p.copy()
    val p3 = p.copy(age = 1990)
    val p4 = p.copy("John Doe")

    println(p)
    println(p2)
    println(p3)
    println(p4)
}

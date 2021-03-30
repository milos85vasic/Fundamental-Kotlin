package net.milosvasic.fundamental.kotlin.object_oriented

object Single {

    var value = 0

    fun print() {
        println("Value: $value, Hash: ${this.hashCode()}")
    }
}

fun main() {

    val s1 = Single
    val s2 = Single
    val s3 = Single

    s1.print()
    s2.print()
    s3.print()

    s1.value = 100

    s1.print()
    s2.print()
    s3.print()
}
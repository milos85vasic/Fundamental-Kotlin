package net.milosvasic.fundamental.kotlin.object_oriented.extensions

class ToBeExtended {
    val a = 15
}

class ExtendsProperty {
    val ToBeExtended.b: Int
        get() = 25

    fun tryout(e: ToBeExtended) {
        println("A: ${e.a}")
        println("A: ${e.b}")
    }
}
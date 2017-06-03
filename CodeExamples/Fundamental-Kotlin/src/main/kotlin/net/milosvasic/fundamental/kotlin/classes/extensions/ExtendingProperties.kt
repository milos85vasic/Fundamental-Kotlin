package net.milosvasic.fundamental.kotlin.classes.extensions

/**
 * Created by milosvasic on 6/9/16.
 */
class ToBeExtended {
    val a = 15
}

class ExtendsProperty {
    val ToBeExtended.b: Int
        get() = 25

    fun tryPropertyExtension(e: ToBeExtended) {
        println("A: ${e.a}")
        println("A: ${e.b}")
    }
}
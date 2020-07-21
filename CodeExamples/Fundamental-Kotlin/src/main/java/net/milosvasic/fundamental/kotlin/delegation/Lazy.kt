package net.milosvasic.fundamental.kotlin.delegation

/**
 * Created by mvasic on 7/19/16.
 */
class UsesLazy {
    val myLazyValue: String by lazy {
        println("I am initializing this lazy value!")
        "My lazy value!"
    }
}

fun useLazy(){
    val usesLazy: UsesLazy = UsesLazy()
    val a: String = usesLazy.myLazyValue
    val b: String = usesLazy.myLazyValue
    val c: String = usesLazy.myLazyValue
}
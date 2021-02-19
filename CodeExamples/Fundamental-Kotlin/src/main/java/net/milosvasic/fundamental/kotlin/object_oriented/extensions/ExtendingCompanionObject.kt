package net.milosvasic.fundamental.kotlin.object_oriented.extensions

class HasCompanion {
    companion object {
        val a = 10
        fun printA() {
            println("A: $a")
        }
    }
}

class ExtendsCompanioObjectClass {
    fun HasCompanion.Companion.printB(){
        println("B: ${ a + 100 }")
    }

    fun tryExtendingCompanionObject(){
        HasCompanion.printA()
        HasCompanion.printB()
    }
}
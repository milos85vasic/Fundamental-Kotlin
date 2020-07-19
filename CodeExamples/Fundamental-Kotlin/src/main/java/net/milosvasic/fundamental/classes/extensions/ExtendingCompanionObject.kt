package net.milosvasic.fundamental.classes.extensions

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
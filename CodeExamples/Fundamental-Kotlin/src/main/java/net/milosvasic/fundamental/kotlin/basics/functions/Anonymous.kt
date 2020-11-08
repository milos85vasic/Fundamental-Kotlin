package net.milosvasic.fundamental.kotlin.basics.functions

fun main() {

    fun example1(){

        val f = fun(x: Int, y: Int): Int = x + y
        f.invoke(1, 2)

    }

    fun example2(){

        val f = fun(x: Int, y: Int): Int {
            return x + y
        }
        val z = 10 + f.invoke(100, 1000)

    }
}

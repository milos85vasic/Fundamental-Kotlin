package net.milosvasic.fundamental.functions

/**
 * Created by mvasic on 7/30/16.
 */
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

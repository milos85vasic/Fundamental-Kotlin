package net.milosvasic.fundamental.kotlin.basics.controll_flow

fun check(x: Int, y: Int) {
    val result = if (x >= y) {
        println("x >= y")
        true
    } else {
        println("x is not >= y")
        false
    }
    println("Result [ $result ]\n- - - - - - - -")
}

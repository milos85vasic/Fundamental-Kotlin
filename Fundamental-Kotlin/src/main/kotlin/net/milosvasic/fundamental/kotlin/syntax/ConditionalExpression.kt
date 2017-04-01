package net.milosvasic.fundamental.kotlin.syntax

/**
 * Created by milosvasic on 6/4/16.
 */
fun conditionalExpressionExample(x: Int, y: Int): Int {
    if(x == y){
        return 1
    } else {
        return 0
    }
}

fun conditionalExpressionExample2(x: Int, y: Int) = if (x == y) 1 else 0

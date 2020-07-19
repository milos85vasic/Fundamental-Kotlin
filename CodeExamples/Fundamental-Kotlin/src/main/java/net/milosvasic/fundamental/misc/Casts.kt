package net.milosvasic.fundamental.misc

/**
 * Created by milosvasic on 8/8/16.
 */
fun castCheck(a: Any) {
    if (a is String) {
        println(a) // a is automatically cast to String!
    }
}
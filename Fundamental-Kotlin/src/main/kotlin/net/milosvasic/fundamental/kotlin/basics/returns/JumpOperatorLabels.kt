package net.milosvasic.fundamental.kotlin.basics.returns

/**
 * Created by milosvasic on 6/8/16.
 */
fun labelsExample(x: Int, y: Int) {
    myLoop@ for (a in 0..x) {
        for (b in 0..y) {
            println("[ $a ][ $b ]")
            if (b == 10) {
                break@myLoop // Does not break current loop, but the one above it!
            }
        }
    }
}

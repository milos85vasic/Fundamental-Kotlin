package net.milosvasic.fundamental.basics.returns

fun breakingTheLoop(x: Int, y: Int) {
    myLoop@ for (a in 0..x) {
        for (b in 0..y) {
            println("[ $a ][ $b ]")
            if (b == 10) {
                break@myLoop // Does not break current loop, but the one above it!
            }
        }
    }
}

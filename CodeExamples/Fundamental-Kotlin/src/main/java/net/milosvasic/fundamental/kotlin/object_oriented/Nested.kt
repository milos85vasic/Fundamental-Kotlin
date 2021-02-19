package net.milosvasic.fundamental.kotlin.object_oriented

/**
 * Created by mvasic on 7/2/16.
 */
class Nested1 {
    val a = 0

    class Nested2 {
        val a = 1

        class Nested3 {
            val a = 2
        }
    }
}

fun tryNested() {
    val n1 = Nested1()
    val n2 = Nested1.Nested2()
    val n3 = Nested1.Nested2.Nested3()

    println("Values ${n1.a}, ${n2.a}, ${n3.a}")
}
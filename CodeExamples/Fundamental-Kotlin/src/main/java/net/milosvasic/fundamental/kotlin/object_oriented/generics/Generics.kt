package net.milosvasic.fundamental.kotlin.object_oriented.generics

fun main() {

    class Container<T>(val data: T) {

        fun describe() {
            println("Data contained: $data")
        }
    }

    val data1 = Container(1)
    val data2 = Container("Some string")
    val data3 = Container(true)

    data1.describe()
    data2.describe()
    data3.describe()
}

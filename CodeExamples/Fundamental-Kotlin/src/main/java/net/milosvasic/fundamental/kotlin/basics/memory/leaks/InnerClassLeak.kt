package net.milosvasic.fundamental.kotlin.basics.memory.leaks

fun main() {

    class Wrapper(private var data: String) {

        inner class Inner {

            fun print() {

                // We are accessing to outer class reference and its field:
                println("Data: $data")
            }
        }
    }

    val wrapper = Wrapper("Kotlin")
    wrapper.Inner().print()
}
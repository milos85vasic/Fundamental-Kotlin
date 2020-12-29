package net.milosvasic.fundamental.kotlin.basics.references.leaks

fun main() {

    class Wrapper(private var data: String) {

        inner class Inner {

            fun print() {

                // We are accessing to enclosing class reference and its field:
                println("Data: $data")
            }
        }
    }

    val wrapper = Wrapper("Kotlin")
    wrapper.Inner().print()
}
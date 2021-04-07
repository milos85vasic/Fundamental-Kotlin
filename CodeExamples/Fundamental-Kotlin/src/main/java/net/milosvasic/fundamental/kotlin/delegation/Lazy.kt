package net.milosvasic.fundamental.kotlin.delegation


fun main() {

    class Example {

        val hello: String by lazy {

            println("I am initializing this lazy value")
            "Hello!"
        }
    }

    val example = Example()

    val a = example.hello
    val b = example.hello
    val c = example.hello
}
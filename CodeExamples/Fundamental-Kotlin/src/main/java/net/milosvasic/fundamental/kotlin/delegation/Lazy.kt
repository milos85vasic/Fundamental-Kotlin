package net.milosvasic.fundamental.kotlin.delegation


fun main() {

    class Example {

        val hello: String by lazy {

            println("I am initializing this lazy value")
            "Hello"
        }
    }

    val example = Example()
    println(example.hello)
}
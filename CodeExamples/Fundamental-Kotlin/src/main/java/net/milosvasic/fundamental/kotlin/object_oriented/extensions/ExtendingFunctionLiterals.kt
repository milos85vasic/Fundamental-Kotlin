package net.milosvasic.fundamental.kotlin.object_oriented.extensions

fun main() {

    class Printer() {

        fun print(what: String) {

            println(what)
        }
    }

    val printQuoted: Printer.(what: String) -> Unit = {

        what ->
        print("\"$what\"")
    }

    val printer = Printer()
    printer.print("Hello world")
    printer.printQuoted("Lorem ipsum")
}
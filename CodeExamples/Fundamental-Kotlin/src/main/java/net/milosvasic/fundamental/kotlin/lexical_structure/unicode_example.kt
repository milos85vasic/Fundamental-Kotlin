package net.milosvasic.fundamental.kotlin.lexical_structure

class МојаКласаНаЋирилици {

    val поздрав = "Поздрав на ћирилици!"
}

fun main() {

    val unicodeClass = МојаКласаНаЋирилици()
    println(unicodeClass.поздрав)
}
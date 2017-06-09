package net.milosvasic.fundamental.kotlin.syntax

fun recognize(what: Any) {
    when (what) {
        25.5 -> println("Floating point [ $what ]")
        is Int -> println("Number [ $what ]")
        is String -> println("A Word [ $what ]")
        is Boolean -> if (what) println("It's true.") else println("It's false.")
        else -> println("Unknown")
    }
}

fun getCarPrice(model: String): Int {
    return when (model) {
        "Mercedes" -> 100000
        "BMW" -> 95000
        "Opel" -> 82000
        else -> throw IllegalArgumentException("We do not recognize this model.")
    }
}

fun getCarPrice2(model: String): Int = when (model) {
    "Mercedes" -> 100000
    "BMW" -> 95000
    "Opel" -> 82000
    else -> throw IllegalArgumentException("We do not recognize this model.")
}

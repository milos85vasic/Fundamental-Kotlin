package net.milosvasic.fundamental.kotlin.idioms

fun obtainCarPrice(carModel: String): Int = when (carModel) {
    "Mercedes" -> 100000
    "Opel" -> 82000
    "Renault" -> 75000
    else -> throw IllegalArgumentException("Unknown car model")
}
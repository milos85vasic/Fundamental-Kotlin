package net.milosvasic.fundamental.kotlin.idioms

fun main() {

    fun getCarPrice(model: String): Int {

        return when (model) {
            "Mercedes" -> 100000
            "BMW" -> 95000
            "Opel" -> 82000
            else -> throw IllegalArgumentException("We do not recognize this model.")
        }
    }

    listOf("BMW", "Fiat", "Mercedes", "Opel", "Renault").forEach { model ->

        try {
            println("$model has a price of ${getCarPrice(model)}")
        } catch (e: Exception) {
            println(e.message)
        }
    }
}

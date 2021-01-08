package net.milosvasic.fundamental.kotlin.basics.exceptions

fun main() {

    @Throws(IllegalArgumentException::class)
    fun getCarPrice(model: String) = when (model) {

        "Mercedes" -> 100
        "BMW" -> 200
        "Opel" -> 300
        else -> throw IllegalArgumentException("We do not recognize this model: '$model'")
    }

    val models = listOf("Mercedes", "Opel", "Fiat")

    models.forEach {
        try {

            val price = getCarPrice(it)
            println("Price of '$it' is $price")
        } catch (e: IllegalArgumentException) {

            println(e.message)
        }
    }
}
package net.milosvasic.fundamental.kotlin.basics.exceptions

fun main() {

    @Throws(IllegalArgumentException::class)
    fun process(what: Int) {

        if (what < 0) {

            throw IllegalArgumentException("Invalid parameter: $what")
        }
        println("Processing: $what")
    }

    val items = listOf(2, 4, 6, 0, -2, -4, -6)
    items.forEach {

        println("Processing started")
        try {

            process(it)
        } catch (t: IllegalArgumentException) {

            println(t.message)
        } finally {

            println("Processing completed")
        }
    }

    // ---

    @Throws(IllegalArgumentException::class)
    fun getCarPrice(model: String) = when (model) {

        "Mercedes" -> 100
        "BMW" -> 200
        "Opel" -> 300
        else -> throw IllegalArgumentException("We do not recognize '$model' car model")
    }

    val models = listOf("Fiat", "BMW", "Opel", "Audi")
    models.forEach {

        println("Getting price for: '$it'")
        val price = try {

            getCarPrice(it)
        } catch (e: IllegalArgumentException) {

            0
        }
        if (price > 0) {

            println("Price obtained: $price")
        } else {

            println("Price is not available")
        }
        println("- - -")
    }
}
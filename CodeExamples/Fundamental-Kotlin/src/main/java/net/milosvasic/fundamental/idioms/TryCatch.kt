package net.milosvasic.fundamental.idioms

import net.milosvasic.fundamental.syntax.getCarPrice

fun tryCatchExample() {
    val carModels = listOf("BMW", "Fiat", "Mercedes", "Opel", "Renault")
    for (model in carModels) {
        try {
            println("$model has a price of ${getCarPrice(model)}")
        } catch(e: Exception) {
            println(e.message)
        }
    }
}

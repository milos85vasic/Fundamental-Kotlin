package net.milosvasic.fundamental.kotlin.idioms

import net.milosvasic.fundamental.kotlin.idioms.getCarPrice


/**
 * Created by mvasic on 6/5/16.
 */
fun tryCatchExample() {
    val carModels = listOf("BMW", "Fiat", "Mercedes", "Opel", "Renault")
    for (carModel in carModels) {
        try {
            println("$carModel has a price of ${getCarPrice(carModel)}")
        } catch(e: Exception) {
            println(e.message)
        }
    }
}

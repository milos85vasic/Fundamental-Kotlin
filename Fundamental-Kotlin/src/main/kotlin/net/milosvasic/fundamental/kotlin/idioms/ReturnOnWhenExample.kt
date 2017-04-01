package net.milosvasic.fundamental.kotlin.idioms

/**
 * Created by mvasic on 6/5/16.
 */
fun getCarPrice(model: String): Int {
    return when (model) {
        "Mercedes" -> 100000
        "BMW" -> 95000
        "Opel" -> 82000
        else -> throw IllegalArgumentException("We do not recognize this model.")
    }
}

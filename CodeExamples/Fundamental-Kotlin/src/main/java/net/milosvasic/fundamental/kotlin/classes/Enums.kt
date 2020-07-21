package net.milosvasic.fundamental.kotlin.classes

/**
 * Created by mvasic on 7/2/16.
 */
enum class TIME {
    MICROSECOND,
    MILLISECOND,
    SECOND,
    MINUTE,
    HOUR,
    DAY,
    WEEK,
    MONTH
}

enum class COUNTRY(val capital: String) {
    ITALY("Rome"),
    SPAIN("Madrid"),
    RUSSIA("Moscow"),
    SCOTLAND("Edinburgh")
}

fun trySomeEunums(){
    println("Time unit: ${TIME.MILLISECOND}")
    println("Time unit: ${TIME.SECOND}")
    println("Time unit: ${TIME.MINUTE}")
    println("Country vs capital: ${COUNTRY.ITALY} -> ${COUNTRY.ITALY.capital}")
    println("Country vs capital: ${COUNTRY.SPAIN} -> ${COUNTRY.SPAIN.capital}")
    println("Country vs capital: ${COUNTRY.RUSSIA} -> ${COUNTRY.RUSSIA.capital}")
}

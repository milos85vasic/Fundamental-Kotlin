package net.milosvasic.fundamental.kotlin.object_oriented

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

fun main() {

    println("Time unit: ${TIME.MILLISECOND}")
    println("Time unit: ${TIME.SECOND}")
    println("Time unit: ${TIME.MINUTE}")
    println("Country vs capital: ${COUNTRY.ITALY} -> ${COUNTRY.ITALY.capital}")
    println("Country vs capital: ${COUNTRY.SPAIN} -> ${COUNTRY.SPAIN.capital}")
    println("Country vs capital: ${COUNTRY.RUSSIA} -> ${COUNTRY.RUSSIA.capital}")
}

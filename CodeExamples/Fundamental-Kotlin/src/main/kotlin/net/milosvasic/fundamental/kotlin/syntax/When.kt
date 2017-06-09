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

// Examples continued:

/**
 * Validate user
 */
fun validate(userType: Int) {
    when (userType) {
        0 -> println("Registered user")
        1 -> print("Administrator")
        else -> {
            println("Unknown")
        }
    }
}

/**
 * Validate user, simplified
 */
fun validate2(userType: Int) {
    when (userType) {
        0, 1 -> println("Welcome user.")
        else -> println("Permission denied.")
    }
}

/**
 * Validate user, extended
 */
fun validate3(userType: Int) {
    when (userType) {
        filterUserType(userType) -> {
            println("Subtype ok")
            validate2(userType)
        }
        else -> print("Subtype not ok")
    }
}

fun filterUserType(userType: Int): Int {
    if (userType in 0..1) {
        return userType
    }
    return -1
}

/**
 * Has user hit the center.
 */
fun precision(points: Int) {
    val max = 100
    when (points) {
        in max / 5..max / 4 -> println("PRECISE")
        in (max / 4)..max - 1 -> println("VERY PRECISE")
        max -> println("STRAIGHT IN TARGET")
        else -> println("MISSED")
    }
}

/**
 * So, is it John really? :D
 */
fun isJohn(fullName: String): Boolean = when (fullName) {
    is String -> fullName.startsWith("John ")
    else -> false
}

/**
 * Welcome message
 */
fun welcome(fullName: String) {
    when {
        fullName.isEmpty() -> println("Please enter your name.")
        fullName.substring(0, 2) == "X " -> println("Hello Mr. X")
        fullName.startsWith("John ") && !fullName.endsWith(" Smith") -> println("Hello John!")
        fullName.endsWith(" Smith") -> println("Hello agent Smith.")
        else -> println("Only secret agents allowed!")
    }
}
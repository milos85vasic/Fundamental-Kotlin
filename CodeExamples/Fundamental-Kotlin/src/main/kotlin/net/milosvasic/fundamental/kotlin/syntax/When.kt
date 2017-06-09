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

// FIXME: Change examples:

fun whenExample(userType: Int) {
    when (userType) {
        0 -> println("Registered user")
        1 -> print("Administrator")
        else -> {
            println("Unknown")
        }
    }
}

fun whenExample2(userType: Int) {
    when (userType) {
        0, 1 -> println("Welcome user.")
        else -> println("Permission denied.")
    }
}

fun whenExample3(userType: Int) {
    when (userType) {
        filterUserType(userType) -> {
            println("Subtype ok")
            whenExample2(userType)
        }
        else -> print("Subtype not ok")
    }
}

fun filterUserType(userType: Int): Int {
    if (userType >= 0 && userType < 2) {
        return userType;
    }
    return -1
}

fun whenExample4(x: Int) {
    val from = 0
    val to = 100
    when (x) {
        in from..to -> println("PRECISE")
        in (from / 2)..(to / 2) -> print("VERY PRECISE")
        50 -> print("STRAIGHT IN TARGET")
        else -> print("MISSED")
    }
}

fun whenExample5(fullName: String) {
    val isJohn = when (fullName) {
        is String -> fullName.startsWith("John ")
        else -> false
    }
}

fun whenExample6(fullName: String) {
    when {
        fullName.length == 0 -> println("Please enter your name.")
        fullName.substring(0, 2).equals("X ") -> println("Hello Mr. X")
        fullName.startsWith("John ") && !fullName.endsWith(" Smith") -> println("Hello John!")
        fullName.endsWith(" Smith") -> println("Hello agent Smith.")
        else -> println("Only secret agents allowed!")
    }
}
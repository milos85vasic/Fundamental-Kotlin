package net.milosvasic.fundamental.kotlin.basics.controll_flow

/**
 * Created by milosvasic on 6/7/16.
 */
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
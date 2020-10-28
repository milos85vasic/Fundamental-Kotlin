package net.milosvasic.fundamental.kotlin.basics.expressions

fun main() {

    fun dataTypeRecognizer(what: Any) {

        when (what) {
            is Float -> println("Floating point")
            is Int -> println("Number")
            is String -> println("String")
            is Boolean -> if (what) {
                println("Boolean: true")
            } else {
                println("Boolean: false")
            }
            else -> println("Unknown")
        }
    }

    @Throws(IllegalArgumentException::class)
    fun getCarPrice(model: String) = when (model) {

        "Mercedes" -> 100
        "BMW" -> 200
        "Opel" -> 300
        else -> throw IllegalArgumentException("We do not recognize this model")
    }

    @Throws(IllegalArgumentException::class)
    fun validateUserType(userType: Int) {

        when (userType) {
            0 -> println("Registered user")
            1 -> print("Administrator")
            else -> {

                println("Error recognizing user type")
                throw IllegalArgumentException("Invalid user type: $userType")
            }
        }
    }

    fun validateAccountType(accountType: Int) {

        when (accountType) {
            0, 1 -> println("Welcome")
            else -> println("Permission denied")
        }
    }

    fun filterUserType(userType: Int): Int {

        if (userType in 0..1) {
            return userType
        }
        return -1
    }

    @Throws(IllegalArgumentException::class)
    fun validateUserTypeFiltered(userType: Int) {

        when (userType) {
            filterUserType(userType) -> {

                println("Ok")
                validateUserType(userType)
            }
            else -> print("Not ok")
        }
    }

    fun precisionCheck(points: Int) {

        val max = 100
        when (points) {
            in max / 5..max / 4 -> println("PRECISE")
            in (max / 4) until max -> println("VERY PRECISE")
            max -> println("STRAIGHT IN TARGET")
            else -> println("MISSED")
        }
    }


}
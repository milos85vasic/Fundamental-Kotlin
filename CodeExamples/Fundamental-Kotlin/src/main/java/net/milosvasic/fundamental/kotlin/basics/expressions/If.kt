package net.milosvasic.fundamental.kotlin.basics.expressions

fun main(){

    fun getMemberTypeById(id: Int): String {

        return if (id == 0) {
            "Unregistered"
        } else if (id == 1) {
            "Registered"
        } else if (id == 2) {
            "Admin"
        } else {
            "Unknown"
        }
    }

    val ids = listOf(0, 1, 2, 3, 4)

    ids.forEach {

        val memberTyeId = getMemberTypeById(it)
        println("Id: $it -> $memberTyeId")
    }
}

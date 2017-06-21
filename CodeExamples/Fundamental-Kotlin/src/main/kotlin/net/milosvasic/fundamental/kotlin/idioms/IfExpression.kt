package net.milosvasic.fundamental.kotlin.idioms

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

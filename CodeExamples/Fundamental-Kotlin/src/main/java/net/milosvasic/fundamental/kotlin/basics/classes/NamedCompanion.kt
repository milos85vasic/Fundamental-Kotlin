package net.milosvasic.fundamental.kotlin.basics.classes

class Database(val type: String) {

    companion object Factory {

        fun createInMemoryDatabase() = Database("InMemory")

        fun createFilesystemDatabase() = Database("Filesystem")
    }

    fun describe() = println("This is '$type' database")
}

fun main () {


}
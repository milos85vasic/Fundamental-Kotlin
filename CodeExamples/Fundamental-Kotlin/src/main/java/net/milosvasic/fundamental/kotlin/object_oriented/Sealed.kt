package net.milosvasic.fundamental.kotlin.object_oriented

sealed class Specie {

    class Human(val race: String) : Specie()
    class Animal(val specie: String, val legsCount: Int) : Specie()
    object Bacteria : Specie()
}

fun main() {

    fun describe(specie: Specie) = when (specie) {

        is Specie.Human -> "Human ${specie.race}"
        is Specie.Animal -> "${specie.specie} with ${specie.legsCount} legs."
        is Specie.Bacteria -> "Some micro organism ..."
    }


}
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

    val indian = describe(Specie.Human("Indian"))
    val asian = describe(Specie.Human("Asian"))

    println(indian)
    println(asian)

    val monkey = describe(Specie.Animal("Monkey", 2))
    val horse = describe(Specie.Animal("Horse", 4))

    println(monkey)
    println(horse)

    val bacteria = describe(Specie.Bacteria)
    println(bacteria)
}
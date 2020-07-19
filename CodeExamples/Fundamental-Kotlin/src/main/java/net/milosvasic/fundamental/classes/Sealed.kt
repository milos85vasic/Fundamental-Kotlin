package net.milosvasic.fundamental.classes

/**
 * Created by milosvasic on 6/8/16.
 */
sealed class SuperEnum {
    class Human(val race: String) : SuperEnum()
    class Animal(val specie: String, val legsCount: Int) : SuperEnum()
    object Bacteria : SuperEnum()
}

fun trySuperEnum(superEnum: SuperEnum): String = when (superEnum) {
    is SuperEnum.Human -> "Human ${superEnum.race}"
    is SuperEnum.Animal -> "${superEnum.specie} with ${superEnum.legsCount} legs."
    is SuperEnum.Bacteria -> "Some micro organism ..."
}
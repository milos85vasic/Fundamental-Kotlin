package net.milosvasic.fundamental.kotlin.basics.data_types

/**
 * Created by milosvasic on 6/7/16.
 */
fun stringsExample(){

    val s = "Some string"

    // Iterate:
    val iterator = s.iterator()
    while(iterator.hasNext()) println("Character: ${iterator.next()}")
    println("- - - - - - - - - - - - - ")

    // For loop:
    for(c in s) println("Character: $c")
    println("- - - - - - - - - - - - - ")

}

fun stringsExample2(){

    val s1 = "Some string"
    val s2 = "Some\tstring\n"
    val s3 = """
        Raw string example...
        We have multiline here!
    """

    println("$s1\n$s2\n$s3")

}

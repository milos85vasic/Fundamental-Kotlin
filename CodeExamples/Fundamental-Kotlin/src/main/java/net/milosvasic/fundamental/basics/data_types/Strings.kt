package net.milosvasic.fundamental.basics.data_types

val s1 = "Some string"

val s2 = "Some\tstring\n"

val s3 = """
        Raw string example ...
        We have multiline here!
    """

fun stringIterator(s: String) {
    val iterator = s.iterator()
    while(iterator.hasNext()) println("Character: ${iterator.next()}")
}

fun stringIterator2(s: String) {
    for(c in s) println("Character: $c")
}




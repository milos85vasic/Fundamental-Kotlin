package net.milosvasic.fundamental.kotlin.basics.data_types.strings

fun main() {

    val s1 = "Some string"

    val s2 = "Some\tstring\n"

    val s3 = """
        Raw string example ...
        We have multiline here!
    """

    val s4 = """
        Raw string example ...
        We have multiline here!
    """.trimIndent()

    val s5 = """
        |Raw string example ...
        |We have multiline here!
    """.trimMargin()

    fun stringIsArray(word: String) {

        word.forEach {
            println(it)
        }
    }

    stringIsArray("Elephant")
}


package net.milosvasic.fundamental.kotlin.basics.data_types.nullability

class NullExamplesKt {

    // Rewriting snippet from "NullExamples.java":
    var b: Boolean? = null
    var nullStringVariable: String? = null

    fun crashMyApp() {

        // Calling 'length()' function will crash the application:
        val size = nullStringVariable!!.length
        println("Length is: $size")
    }

    fun safeAccess() {

        // 'size' constant gets Int? type:
        val size = nullStringVariable?.length
        println("Length is: $size")
    }

    fun safeAccess2() {

        nullStringVariable = "Elephant"
        safeAccess()
    }

    fun optionals() {

        nullStringVariable = "House"
        val number = 10
        val size = nullStringVariable?.length

        // Operator call corresponds to a dot-qualified call 'size.plus(number)'
        // which is not allowed on a nullable receiver 'size':
        // val sum = size + number

        // This will work:
        val sum = size?.plus(number)
        println("Sum is: $sum")
    }
}

fun main() {

    val nullExamplesKt = NullExamplesKt()
    nullExamplesKt.safeAccess()
    nullExamplesKt.safeAccess2()
    nullExamplesKt.optionals()
}
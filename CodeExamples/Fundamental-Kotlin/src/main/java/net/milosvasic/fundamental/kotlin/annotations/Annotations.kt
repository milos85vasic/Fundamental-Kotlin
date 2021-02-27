package net.milosvasic.fundamental.kotlin.annotations

@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.CONSTRUCTOR,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.EXPRESSION,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.PROPERTY_GETTER
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Marker

@Marker
class Annotated {

    @Marker
    fun hello(@Marker who: String): String {

        return (@Marker "Hello $who")
    }
}

class Annotated2 @Marker constructor()

class Annotated3 {

    var number: Int? = null
        @Marker set
}

fun main() {


}
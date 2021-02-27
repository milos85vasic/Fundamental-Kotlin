package net.milosvasic.fundamental.kotlin.object_oriented

@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.CONSTRUCTOR,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.EXPRESSION
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Marker

@Marker class Annotated {

    @Marker fun hello(@Marker who: String): String {

        return (@Marker "Hello $who")
    }
}

class Annotated2 @Marker constructor()

fun main() {


}
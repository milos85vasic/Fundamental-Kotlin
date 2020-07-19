package net.milosvasic.fundamental.misc

/**
 * Created by mvasic on 8/16/16.
 */
class ExceptionExamples {

    fun exceptionExmple() {
        try {
            // do something ...
        } catch (e: KotlinNullPointerException) {
            // handle exception
        } finally {
            // do something ...
        }
    }

    // Try / Catch is expression!
    fun exceptionExample2(): Int {
        return try {
            // do something
            0
        } catch (e: KotlinNullPointerException) {
            // handle exception
            -1
        }
    }

}
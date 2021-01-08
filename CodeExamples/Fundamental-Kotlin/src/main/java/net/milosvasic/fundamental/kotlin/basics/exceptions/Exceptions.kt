package net.milosvasic.fundamental.kotlin.basics.exceptions


fun main() {

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
}
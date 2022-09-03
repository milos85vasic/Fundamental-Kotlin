package net.milosvasic.fundamental.kotlin.basics.functions

import java.util.*

fun main() {

    fun logNewEntry(date: Date = Date(), who: String, what: String = "") {

        val jobPerformer = if (what.isEmpty()) {

            "No job performed"
        } else {

            "Performed: $what"
        }
        println("$date :: $who :: $jobPerformer")
    }

    val today = Date()
    val name = "John Smith"
    val cleaning = "Cleaning windows"

    logNewEntry(today, name)
    logNewEntry(today, name, cleaning)
    logNewEntry(date = today, who = name, what = cleaning)
    logNewEntry(what = cleaning, date = today, who = name)
    logNewEntry(who = name)
    logNewEntry(today, who = name)
}

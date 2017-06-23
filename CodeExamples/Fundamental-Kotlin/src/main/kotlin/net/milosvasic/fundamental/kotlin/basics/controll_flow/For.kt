package net.milosvasic.fundamental.kotlin.basics.controll_flow

fun members(members: Array<String>) {
    for ((index, value) in members.withIndex()) {
        println("[ $index ][ $value ]")
    }
}

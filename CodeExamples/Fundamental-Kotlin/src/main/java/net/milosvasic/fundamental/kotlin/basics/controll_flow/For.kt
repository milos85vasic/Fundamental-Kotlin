package net.milosvasic.fundamental.kotlin.basics.controll_flow

fun members(members: Array<String>) {
    for ((index, value) in members.withIndex()) {
        println("[ $index ][ $value ]")
    }
}

fun members2(members: Collection<String>) {
    for (value in members) {
        println("[ $value ]")
    }
}

fun letters(word: String) {
    for (letter in word) {
        println("[ $letter ]")
    }
}

fun numbers(to: Int) {
    for (number in 0..100) println("[ $number ]")
}

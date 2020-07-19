package net.milosvasic.fundamental.syntax

fun counter(to: Int) {
    for (x in 0..to) {
        println("[ $x ]")
    }
}

fun cars(cars: Collection<String>) {
    for(c in cars.indices){
        // Do something with index of an element.
    }
}

fun clubs(clubs: Collection<String>) {
    for (c in clubs) println("Club [ ${c.capitalize()} ]")
}

fun clubs2(clubs: Collection<String>) {
    clubs.forEach {
        c ->
        println("Club [ ${c.capitalize()} ]")
    }
}

fun players(players: Collection<String>) {
    players.forEachIndexed {
        index, item ->
        println("[ $index ] ${item.capitalize()}")
    }
}

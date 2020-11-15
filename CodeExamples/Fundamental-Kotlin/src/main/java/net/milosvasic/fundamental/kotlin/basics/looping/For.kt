package net.milosvasic.fundamental.kotlin.basics.looping

import java.util.function.Consumer

fun main() {

    fun counter(to: Int) {

        for (x in 0..to) {
            println("x: $x ")
        }
    }

    fun counter2(to: Int) {

        for (x in 0 until to) {
            println("x: $x ")
        }
    }

    fun cars(cars: List<String>) {

        for (index in cars.indices) {
            println("Car '${cars[index]}' index is: $index")
        }
    }

    fun cities(cities: List<String>) {

        for (city in cities) {
            println("City: ${city.capitalize()}")
        }
    }

    fun citiesKt(clubs: List<String>) {

        clubs.forEach { city ->
            println("City: ${city.capitalize()}")
        }
    }

    fun citiesKt2(clubs: List<String>) {

        clubs.forEach(

                Consumer { city ->
                    println("City: ${city.capitalize()}")
                }
        )
    }

    fun players(players: List<String>) {

        players.forEachIndexed { index, item ->
            println("Player $index: ${item.capitalize()}")
        }
    }

    counter(5)
    counter2(5)

    val cities = listOf("Belgrade", "Rome", "Moscow", "New York")
    citiesKt(cities)

    val players = listOf("John Smith", "John Doe", "Peter Pan")
    players(players)
}

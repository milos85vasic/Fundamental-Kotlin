package net.milosvasic.fundamental.kotlin.idioms;

/**
 * Created by mvasic on 6/6/16.
 */
class Human {
    fun walk() {
        println("Walking");
    }

    fun talk() {
        println("Talking");
    }

    fun jump() {
        println("Jumping");
    }

    fun swim() {
        println("Swimming");
    }
}

fun useHuman(human: Human) {
    with(human) {
        walk()
        walk()
        walk()
        jump()
        swim()
        jump()
        walk()
        walk()
    }
}



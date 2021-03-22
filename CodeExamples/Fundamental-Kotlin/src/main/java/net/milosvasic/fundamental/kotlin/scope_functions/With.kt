package net.milosvasic.fundamental.kotlin.scope_functions


fun main() {

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

    val human = Human()
    with(human) {

        walk()
        walk()
        walk()
        jump()
        swim()
        jump()
        walk()
        walk()
        talk()
    }
}



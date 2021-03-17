package net.milosvasic.fundamental.kotlin.object_oriented.extensions

interface Drawing {

    fun draw()
}

class Objects {

    val circle = object : Drawing {

        override fun draw() {

            println("Circle")
        }
    }
}

val Objects.square: Drawing
    get() = object : Drawing {

        override fun draw() {

            println("Square")
        }
    }

fun main() {

    val o = Objects()
    with(o) {

        circle.draw()
        square.draw()
    }
}
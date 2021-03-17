package net.milosvasic.fundamental.kotlin.object_oriented.extensions

interface Drawing {

    fun draw()
}

class Objects {

    val CIRCLE = object : Drawing {

        override fun draw() {

            println("Circle")
        }
    }
}

val Objects.SQUARE: Drawing
    get() = object : Drawing {

        override fun draw() {

            println("Square")
        }
    }

fun main() {

    val o = Objects()
    with(o) {

        CIRCLE.draw()
        SQUARE.draw()
    }
}
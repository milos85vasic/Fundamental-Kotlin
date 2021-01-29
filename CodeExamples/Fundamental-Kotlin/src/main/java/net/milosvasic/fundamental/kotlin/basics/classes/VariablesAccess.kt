package net.milosvasic.fundamental.kotlin.basics.classes

fun main(){

    var countLeft = 0
    var countRight = 0
    val executor = Executor()

    val left = object: Command(){

        override fun execute() {

            println("Left")
            countLeft++
        }
    }

    val right = object: Command(){

        override fun execute() {

            println("Right")
            countRight++
        }
    }

    executor.addCommand(left)
    executor.addCommand(left)
    executor.addCommand(left)
    executor.addCommand(right)
    executor.addCommand(right)
    executor.addCommand(left)

    println("Executed left: $countLeft")
    println("Executed right: $countRight")
    executor.execute()
    println("Executed left: $countLeft")
    println("Executed right: $countRight")
}

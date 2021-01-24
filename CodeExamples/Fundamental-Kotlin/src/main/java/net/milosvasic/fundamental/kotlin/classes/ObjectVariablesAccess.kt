package net.milosvasic.fundamental.kotlin.classes

import net.milosvasic.fundamental.kotlin.basics.classes.Command
import net.milosvasic.fundamental.kotlin.basics.classes.Executor


fun countExecution() {

    val executor = Executor()
    var leftExecuted = 0
    var rightExecuted = 0

    val left = object: Command(){
        override fun execute() {
            println("LEFT")
            leftExecuted++
        }
    }

    val right = object: Command(){
        override fun execute() {
            println("RIGHT")
            rightExecuted++
        }
    }

    executor.addCommand(left)
    executor.addCommand(left)
    executor.addCommand(left)
    executor.addCommand(right)
    executor.addCommand(right)
    executor.addCommand(left)

    println("LEFT vs RIGHT, [ ${leftExecuted} ][ ${rightExecuted} ]")
    executor.execute()
    println("LEFT vs RIGHT, [ ${leftExecuted} ][ ${rightExecuted} ]")
}

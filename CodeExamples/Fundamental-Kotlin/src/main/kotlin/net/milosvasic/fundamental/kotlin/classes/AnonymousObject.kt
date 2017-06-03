package net.milosvasic.fundamental.kotlin.classes

/**
 * Created by mvasic on 7/3/16.
 */
abstract class Command {
    abstract fun execute()
}

class Executor : Command() {
    private val commands = mutableListOf<Command>()

    fun addCommand(command: Command) {
        commands.add(command)
    }

    override fun execute() {
        for (command in commands) {
            command.execute()
        }
    }
}

fun tryAnonymousObjects() {
    val executor = Executor()

    executor.addCommand(object : Command() {
        override fun execute() {
            println("Starting session.")
        }
    })

    executor.addCommand(object : Command() {
        override fun execute() {
            println("Logging in.")
        }
    })

    executor.addCommand(object : Command() {
        override fun execute() {
            println("Launch app 1")
        }
    })

    executor.addCommand(object : Command() {
        override fun execute() {
            println("Launch app 2")
        }
    })

    executor.addCommand(object : Command() {
        override fun execute() {
            println("Logging out")
        }
    })

    executor.addCommand(object : Command() {
        override fun execute() {
            println("Stopping session")
        }
    })

    executor.execute()
}
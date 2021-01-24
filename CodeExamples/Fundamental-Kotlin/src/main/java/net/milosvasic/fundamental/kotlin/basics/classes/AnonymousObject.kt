package net.milosvasic.fundamental.kotlin.basics.classes


fun main() {

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

    // Let's try it:
    val executor = Executor()

    val obj = object : Command() {

        override fun execute() {

            println("Starting session.")
        }
    }
    executor.addCommand(obj)

    val obj2 = object : Command() {

        override fun execute() {

            println("Logging in.")
        }
    }
    executor.addCommand(obj2)

    val obj3 = object : Command() {

        override fun execute() {

            println("Launch app 1")
        }
    }
    executor.addCommand(obj3)

    val obj4 = object : Command() {

        override fun execute() {

            println("Launch app 2")
        }
    }
    executor.addCommand(obj4)

    val obj5 = object : Command() {

        override fun execute() {

            println("Logging out")
        }
    }
    executor.addCommand(obj5)

    val obj6 = object : Command() {

        override fun execute() {

            println("Stopping session")
        }
    }
    executor.addCommand(obj6)

    executor.execute()
}
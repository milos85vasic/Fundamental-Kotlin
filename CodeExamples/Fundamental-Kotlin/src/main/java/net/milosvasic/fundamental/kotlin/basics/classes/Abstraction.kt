package net.milosvasic.fundamental.kotlin.basics.classes

fun main() {

    abstract class Animal {

        abstract fun walk()
    }

    open class Cat : Animal() {

        override fun walk() {

            println("Cat walks")
        }
    }

    class Lion : Cat() {

        override fun walk() {

            println("Lion walks")
        }
    }

    val cat = Cat()
    val lion = Lion()

    cat.walk()
    lion.walk()

    println("- - - - -")

    abstract class DbProvider {

        abstract val database: String
    }

    class PostgresProvider : DbProvider() {

        override val database: String
            get() = "Postgres"
    }

    class MySQLProvider : DbProvider() {

        override val database: String
            get() = "MySQL"
    }

    val databases = listOf(

        PostgresProvider().database,
        MySQLProvider().database
    )

    databases.forEach {

        println(it)
    }
}
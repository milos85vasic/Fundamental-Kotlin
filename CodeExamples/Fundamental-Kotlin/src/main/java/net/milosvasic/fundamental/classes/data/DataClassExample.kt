package net.milosvasic.fundamental.classes.data

data class Employee(val name: String, val age: Int) {}

data class Worker(val name: String = "Unknown", val age: Int = 1970) {}
package net.milosvasic.fundamental.kotlin.basics.functions

// Function accepts 2 Integer arguments and returns its multiplication
fun multiply(a: Int, b: Int) = a * b

// Function accepts 2 Integer arguments and returns its division
fun divide(a: Int, b: Int) = a / b

// Main program function receives arguments from command line:
fun main(args: Array<String>) {

    val x = 5
    val y = 7

    // We are passing values of 'x' and 'y' constants as parameters to 'multiply' function:
    val z = multiply(x, y)

    // We are passing result(s) of 'sum' function as arguments to 'divide' function:
    val m = divide(
            sum(x, y),
            sum(1, 2)
    )

    // We are passing String (a word) as a parameter to 'println' function:
    println("Z: $z, M: $m")
}
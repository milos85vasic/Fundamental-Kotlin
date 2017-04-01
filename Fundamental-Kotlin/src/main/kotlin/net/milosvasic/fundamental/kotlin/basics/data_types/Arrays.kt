package net.milosvasic.fundamental.kotlin.basics.data_types

/**
 * Created by milosvasic on 6/7/16.
 */
fun arraysExample(){
    // Array of 10 items which values are genereted by: index + 100
    val a = Array(5, { i -> i + 100 })
    for(x in a) println("A member: $x")
    println("- - - - - - - - - - - - - set 1000 to element at 2")
    a[2] = 1000 // or: a.set(2, 1000)
    for(x in a) println("A member: $x")
    println("- - - - - - - - - - - - - ")
    val y = a.get(0)
    println("Member at 0 position: $y")
    println("- - - - - - - - - - - - - ")

    val b = arrayOf(2, 4, 6, "Some string", "One more string", 8, 10)
    b[1] = 10 // Replace 4 with 10!
    for(x in b) println("B member : $x")
    println("- - - - - - - - - - - - - ")

    val c = arrayOfNulls<Int>(5)
    for(x in c) println("C member: $x")
    println("- - - - - - - - - - - - - set values to members")
    for (x in c.indices) c[x] = x + 1000 // or: c.set(x, x + 1000)
    for(x in c) println("C member: $x")
    println("- - - - - - - - - - - - - ")

    val d = intArrayOf(10, 100, 1000, 10000)
    for(x in d) println("D member: $x")
    println("- - - - - - - - - - - - - set values to members")
    for (x in d.indices) d[x] = d[x] + 5000 // or:  d.set(x, d.get(x) + 5000)
    for(x in d) println("D member: $x")
    println("- - - - - - - - - - - - - ")
    println("A size ${a.size}")
    println("B size ${b.size}")
    println("C size ${c.size}")
    println("D size ${d.size}")
    println("- - - - - - - - - - - - - ")
}
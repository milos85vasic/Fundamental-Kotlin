package net.milosvasic.fundamental.kotlin.basics.data_types

// Simple array of integers
val myArray = arrayOf(2, 4, 6, 8, 10)

// Array of 10 items which values are generated by: index + 100:
val a = Array(5, { i -> i + 100 })

// Set 1000 to element at 2
// a[2] = 1000

// Access to first member and assign it's value to y:
val y = a[0]

// Array with members of various type:
val b = arrayOf(2, 4, 6, "Some string", "One more string", 8, 10)

// Then, replace 4 with 10:
// b[1] = 10

// Array of nulls:
val c = arrayOfNulls<Int>(5)

// Array of integers:
val d = intArrayOf(10, 100, 1000, 10000)
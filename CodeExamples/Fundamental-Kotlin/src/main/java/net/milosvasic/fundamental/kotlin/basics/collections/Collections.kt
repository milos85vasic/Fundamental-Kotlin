package net.milosvasic.fundamental.kotlin.basics.collections

fun main() {

    val numbers = listOf(2, 4, 6)
    val words = listOf("Some", "Word")

    val number = numbers[0]
    val word = words[1]
    val lastNumber = numbers[numbers.lastIndex]

    println("Number: $number")
    println("Word: $word")
    println("Last number: $lastNumber")

    val numbersListSize = numbers.size
    val wordsListSize = words.size

    println("Numbers list size is: $numbersListSize")
    println("Words list size is: $wordsListSize")

    for (x in 0..10) {

        if (numbers.contains(x)){
            println("Numbers collection contains: $x")
        } else {
            println("Numbers collection does not contain: $x")
        }
    }

    val userIds = mapOf("john.smith" to 1, "john.doe" to 2)
    val userCredentials = mapOf(Pair("john.smith", "12345"), Pair("john.doe", "24680"))

    val numbersSet = setOf(2, 2, 3) // It only has members 2 and 3, no duplicates
    numbersSet.forEach(::println) // Will output: 2 and 3

    /**
     * Mutable lists
     */
    val mutableList = mutableListOf(2, 4, 6)
    val mutableList2 = mutableListOf("Some", "Word")
    val mutableList3 = mutableListOf<String>()

    /**
     * It is mutable, let’s change it!
     */
    fun changeMutable(){
        // We can also remove some members.
        mutableList2.remove("Word")

        // or add
        mutableList3.add("Car")
        mutableList2.add("Plane")
        mutableList2.addAll(mutableList3)
    }

    /**
     * Mutable maps
     */
    val mutableMap = mutableMapOf("something" to 1, "else" to 2)
    val mutableMap2 = mutableMapOf(Pair(1, "Plane"), Pair(2, "Car"))

    /**
     * Mutable sets
     */
    val mutableSet = mutableSetOf(2, 2, 3)

    /**
     * Let's chane it!
     */
    fun changeMutable2(){
        mutableSet.add(1)
        mutableSet.add(4)
        mutableSet.add(5)
        mutableSet.add(6)

        // We remove all members that are > 2
        mutableSet.removeIf { x -> x > 2 }

        // Outputs 2 and 1 (:: meaning direct access to reference)
        mutableSet.forEach(::println)
    }

    /**
     * Access to the first list element.
     */
    fun getListElement() : Int {
        // Access to element at first position:
        return mutableList[0]
    }

    /**
     * Access to map element.
     */
    fun getMapElement() : Int? {
        // We get element mapped to "something” key
        // Since collection may or may not contain element with the key
        // we will return Int?
        return mutableMap["something"]
    }

    fun printCollections(){

        mutableList.forEach { x -> println(x) } // or (conversion of lambda to reference) mutableList.forEach(::doSomething)
        // if we need index for each element:
        mutableList.forEachIndexed {
            index, item -> println("$index, $item")
        }
        // or we can apply filter if needed:
        mutableList
                .filter { x -> x >= 4 } .forEach(::println)

    }
}


package net.milosvasic.fundamental.kotlin.basics.collections

fun main() {

    /**
     * Immutable lists
     */
    val immutableList = listOf(2, 4, 6)
    val immutableList2 = listOf("Some", "Word")

    /**
     * Immutable maps
     */
    val immutableMap = mapOf("something" to 1, "else" to 2)
    val immutableMap2 = mapOf(Pair(1, "Plane"), Pair(2, "Car"))

    /**
     * Immutable sets
     */
    val immutableSet = setOf(2, 2, 3) // It only has members 2 and 3.

    fun printSet() {
        immutableSet.forEach(::println) // Outputs 2 and 3 (:: meaning direct access to reference) immutableSet.forEach(::println)
    }

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


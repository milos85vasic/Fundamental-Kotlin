package net.milosvasic.fundamental.kotlin.basics.collections

lateinit var doubles: List<Double>

fun main() {

    val numbers = listOf(2, 4, 6)
    doubles = listOf(3.14, 2.16, 1.0)
    val words = listOf("Some", "Word")

    val number = numbers[0]
    val word = words[1]
    val double = doubles[2]
    val lastNumber = numbers[numbers.lastIndex]

    println("Number: $number")
    println("Word: $word")
    println("Double: $double")
    println("Last number: $lastNumber")

    val doublesListSize = doubles.size
    val numbersListSize = numbers.size
    val wordsListSize = words.size

    println("Doubles list size is: $doublesListSize")
    println("Numbers list size is: $numbersListSize")
    println("Words list size is: $wordsListSize")

    for (x in 0..10) {

        if (numbers.contains(x)) {
            println("Numbers collection contains: $x")
        } else {
            println("Numbers collection does not contain: $x")
        }
    }

    val toCheck = listOf(6, 4, 2)
    val toCheck2 = listOf(1, 3, 5)
    val toCheck3 = listOf(4, 6, 4)

    println("$toCheck in $numbers: ${numbers.containsAll(toCheck)}")
    println("$toCheck2 in $numbers: ${numbers.containsAll(toCheck2)}")
    println("$toCheck3 in $numbers: ${numbers.containsAll(toCheck3)}")

    numbers.forEach {

        val position = numbers.indexOf(it)
        println("Position of $it in $numbers is: $position")
    }

    val emptyList = listOf<Int>()
    println("Is 'emptyList' list empty: ${emptyList.isEmpty()}")
    println("Is 'numbers' list full: ${numbers.isNotEmpty()}")

    val slice = numbers.subList(0, 2)
    println("Slice: $slice")

    val indices = numbers.indices
    indices.forEach {

        println("Index: $it -> ${numbers[it]}")
    }

    val iterator = numbers.iterator()
    while (iterator.hasNext()) {

        val item = iterator.next()
        println("Number: $item")
    }

    val userIds = mapOf("john.smith" to 1, "john.doe" to 2)
    val userCredentials = mapOf(Pair("john.smith", "12345"), Pair("john.doe", "24680"))

    val user = "john.smith"
    val id = userIds[user]
    val credentials = userCredentials[user]
    println("User: $user, Id: $id, Credentials: $credentials")

    println("Users count in the system is: ${userIds.size}")

    listOf(user, "guest", "john.doe").forEach {

        val hasUser = userCredentials.containsKey(it)
        if (hasUser) {
            println("$it is in the system")
        } else {
            println("$it is not in the system")
        }
    }

    val wordPairs = mapOf("Hello" to "World", "Lorem" to "Ipsum")
    listOf("Elephant", "Hello", "World", "Car").forEach {

        val containsWord = wordPairs.containsValue(it)
        if (containsWord) {
            println("$wordPairs contains value $it")
        } else {
            println("$wordPairs does not contain value $it")
        }
    }

    val maps = listOf(mapOf(), wordPairs)
    maps.forEach {

        if (it.isNotEmpty()) {

            println("Map: $it")
        } else {

            println("Map: empty")
        }
    }

    userCredentials
        .filterKeys { it.contains("smith") }
        .forEach {

            println("Smith: ${it.key}")
        }

    userCredentials
        .filterValues { it.toInt() > 20 * 1000 }
        .forEach {

            println("User ${it.key}, Id: ${it.value}")
        }

    userCredentials.filter {

        it.key.contains("smith")
                || it.value.toInt() > 20 * 100
    }.forEach { (key, value) ->

        println("User matched: $key, Id: $value")
    }

    userCredentials
        .filterNot { it.key.contains("doe") }
        .forEach {

            println("User '${it.key}' does not contain 'doe'")
        }

    val mix = userCredentials + mapOf("somebody.else" to "11111", "lorem.ipsum" to "22222")
    println("'+': $mix")

    val diff = mix - userCredentials.keys
    println("'-': $diff")

    val numbersSet = setOf(2, 2, 3) // It only has members 2 and 3, no duplicates
    numbersSet.forEach(::println)   // Will output: 2 and 3

    var first = numbersSet.elementAt(0)
    println("First set element is: $first")

    first = numbersSet.first()
    val last = numbersSet.last()
    println("First: $first")
    println("Last: $last")

    val cars = setOf("Fiat", "Bmw", "Audi", "Porsche", "Renault")
    val findFirst = cars.first { it.length == 3 }
    val findLast = cars.last { it.startsWith("Por") }
    println("First car that has three letters is: $findFirst")
    println("Last car which name starts with 'Por': $findLast")

    var findFirstOrNull = cars.firstOrNull { it.length == 3 }
    var findLastOrNull = cars.lastOrNull { it.startsWith("Por") }
    println("First car that has three letters is: $findFirstOrNull")
    println("Last car which name starts with 'Por': $findLastOrNull")
    findFirstOrNull = cars.firstOrNull { it.length == 10 }
    findLastOrNull = cars.lastOrNull { it.startsWith("Cry") }
    println("First car that has ten letters is: $findFirstOrNull")
    println("Last car which name starts with 'Cry': $findLastOrNull")
    findFirstOrNull = cars.find { it.length == 4 }
    findLastOrNull = cars.findLast { it.startsWith("A") }
    println("First car that has four letters is: $findFirstOrNull")
    println("Last car which name starts with 'A': $findLastOrNull")

    for (x in 0..5) {

        val random = cars.random()
        println("Random chosen car model: $random")
    }

    val hasRenault = cars.contains("Renault")
    val hasVolvo = cars.contains("Volvo")
    println("Has Renault: $hasRenault")
    println("Has Volvo: $hasVolvo")

    val checking = listOf(

        listOf("Renault", "Bmw"),
        listOf("Mercedes", "Bmw")
    )
    checking.forEach { check ->

        val result = cars.containsAll(check)
        if (result) {

            println("$check is in $cars")
        } else {
            println("$check is NOT in $cars")
        }
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
    fun changeMutable() {
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
    fun changeMutable2() {
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
    fun getListElement(): Int {
        // Access to element at first position:
        return mutableList[0]
    }

    /**
     * Access to map element.
     */
    fun getMapElement(): Int? {
        // We get element mapped to "something” key
        // Since collection may or may not contain element with the key
        // we will return Int?
        return mutableMap["something"]
    }

    fun printCollections() {

        mutableList.forEach { x -> println(x) } // or (conversion of lambda to reference) mutableList.forEach(::doSomething)
        // if we need index for each element:
        mutableList.forEachIndexed { index, item ->
            println("$index, $item")
        }
        // or we can apply filter if needed:
        mutableList
            .filter { x -> x >= 4 }.forEach(::println)

    }
}


package net.milosvasic.fundamental.kotlin.basics.returns

/**
 * Created by milosvasic on 6/8/16.
 */
fun returnAtLabelsExample(ints: List<Int>) {
    ints.forEach {
        if (it == 0) return
        println("Item: $it")
    }
}

fun returnAtLabelsExample2(ints: List<Int>) {
    ints.forEach myLabel@ {
        if (it == 0) return@myLabel
        println("Item: $it")
    }
}

fun returnAtLabelsExample3(ints: List<Int>) {
    ints.forEach {
        if (it == 0) return@forEach
        println("Item: $it")
    }
}

fun returnAtLabelsExample4(ints: List<Int>) {
    ints.forEach(
            fun(value: Int) {
                if (value == 0) return
                println("Item: $value")
            }
    )
}

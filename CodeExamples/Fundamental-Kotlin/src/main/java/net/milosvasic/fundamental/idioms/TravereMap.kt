package net.milosvasic.fundamental.idioms


fun traverse(map: Map<String, Int>) {
    for ((key, value) in map) println("[ $key ] : [ $value ]")
}
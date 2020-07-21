package net.milosvasic.fundamental.kotlin.idioms

fun String.stripDownWithUnderscores(): String {
    return this.replace(" ", "_")
}

// Or using infix:

fun String.`Strip down with underscores`(): String {
    return this.replace(" ", "_")
}

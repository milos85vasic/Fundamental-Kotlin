package net.milosvasic.fundamental.idioms

fun String.stripDownWithUnderscores(): String {
    return this.replace(" ", "_")
}

// Or using infix:

fun String.`Strip down with underscores`(): String {
    return this.replace(" ", "_")
}

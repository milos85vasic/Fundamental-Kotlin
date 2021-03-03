package net.milosvasic.fundamental.kotlin.annotations

annotation class Meta(val data: Array<String>)

@Meta(["Hello", "World"]) class Data

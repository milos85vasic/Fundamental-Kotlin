package net.milosvasic.fundamental.kotlin.syntax

/**
 * Created by milosvasic on 6/4/16.
 */
// Assigned once - read only: ========================
// We provide type and the value:
val x: Int = 1

// Int type is inferred
val y = 1

// Type is required when no initializer is provided:
// val z: Int

// Mutable: ========================
var m: Int = 0
// later in your app: m = m + 1 and so on... value will be changed with the new one.

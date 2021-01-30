package net.milosvasic.fundamental.kotlin.basics.object_oriented

import java.awt.Image
import java.net.URL

object ImageManager {

    private val images = mutableListOf<Image>()

    fun download(url: URL): Boolean {

        // Perform image download procedure
        // and add to 'images' collection ...
        return true
    }

    fun getImages() = images
}

fun main() {

    val url = URL("https://fundamental-kotlin.com/images/cover.png")
    ImageManager.download(url) // <-- No instantiation needed for the 'ImageManager' data type
}
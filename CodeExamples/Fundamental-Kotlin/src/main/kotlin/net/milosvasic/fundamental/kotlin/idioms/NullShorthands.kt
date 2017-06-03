package net.milosvasic.fundamental.kotlin.idioms

/**
 * Created by mvasic on 6/5/16.
 */
class Player{
    fun play(){
        println("playing ...")
    }
}

fun nullShorthandsExample(){
    fun getPlayer(): Player? {
        return Player() // << comment or uncomment this 2 lines
        // return null  // << comment or uncomment this 2 lines
    }

    val player = getPlayer()
    player?.play()
}

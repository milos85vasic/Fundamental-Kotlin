package net.milosvasic.fundamental.idioms


object DbManager {

    val version = 1
    val name = "cars"

    val db: SQLiteDatabase by lazy {
        DbHelper(name, version).writableDatabase()
    }

}

class SQLiteDatabase

class DbHelper(val name: String, val version: Int) {

    fun writableDatabase(): SQLiteDatabase = SQLiteDatabase()

}





package net.milosvasic.fundamental.kotlin.object_oriented

class SQLiteDatabase

class DbHelper(val dbName: String, val dbVersion: Int) {

    fun getWritableDatabase(): SQLiteDatabase = SQLiteDatabase()
}

object DbManager {

    private const val dbName = "cars"
    private const val dbVersion = 1

    val database: SQLiteDatabase by lazy {

        DbHelper(dbName, dbVersion).getWritableDatabase()
    }
}





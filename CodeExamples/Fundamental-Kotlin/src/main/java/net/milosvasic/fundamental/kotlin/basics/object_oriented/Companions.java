package net.milosvasic.fundamental.kotlin.basics.object_oriented;

public class Companions {

    public static void tryIt() {

        // This class companion object is not named:
        Greeting.Companion.hello();

        // Let's try named one:
        Database database = Database.Factory.createInMemoryDatabase();
        database.describe();
    }
}

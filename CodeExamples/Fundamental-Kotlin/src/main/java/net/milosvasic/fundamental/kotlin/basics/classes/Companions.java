package net.milosvasic.fundamental.kotlin.basics.classes;

public class Companions {

    public static void tryIt() {

        // Companion object is not named:
        Greeting.Companion.hello();

        // Let's trt named one:
        Database database = Database.Factory.createInMemoryDatabase();
    }
}

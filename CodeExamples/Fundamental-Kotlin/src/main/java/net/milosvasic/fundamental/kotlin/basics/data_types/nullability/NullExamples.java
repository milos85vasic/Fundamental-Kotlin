package net.milosvasic.fundamental.kotlin.basics.data_types.nullability;

class NullExamples {

    // Null by default:
    Boolean b;
    String nullStringVariable;

    // Initialize variables:
    void init() {

        nullStringVariable = "My string";
        b = true;
    }

    void crashMyApp() {

        nullStringVariable = null;
        // Calling 'length()' method will crash the application:
        int size = nullStringVariable.length();
        System.out.println("Length is: " + size);
    }

    public static void main(String[] args) {

    }
}

package task_10_Overloading;

public class Stringconcatenation {

    // Concatenate two strings
    public static String concatStrings(String s1, String s2) {
        return s1 + s2;
    }

    // Concatenate a string and an integer number
    public static String concatStringAndNumber(String s, int num) {
        return s + num;
    }

    // Concatenate a string and a double number
    public static String concatStringAndNumber(String s, double num) {
        return s + num;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(concatStrings("Hello, ", "World!"));      // Hello, World!
        System.out.println(concatStringAndNumber("Age: ", 30));       // Age: 30
        System.out.println(concatStringAndNumber("Price: ", 19.99));  // Price: 19.99
    }
}


package oopspractice;

public class RandomNumberGenerator {
    // Method without parameters but with return value
    static int getRandomNumber() {
        int number = (int) (Math.random() * 100); // random number between 0-99
        return number;
    }

    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();

        // Call method and store the returned value
        int randomNum = rng.getRandomNumber();
        //or below is used by using static only but at upper no need static
        //int randomNum = RandomNumberGenerator.getRandomNumber();

        // Display the result
        System.out.println("Generated random number: " + randomNum);
    }
}


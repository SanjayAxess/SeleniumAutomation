package Task3IfElseAndForLoop.SimpleProblems;

import java.util.Scanner;

public class ForLoopMultiplicationTableOfGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to print the multiplication number :");
        int number = scanner.nextInt();
        for (int i = 1; i <= 20; i++) {
            long result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}

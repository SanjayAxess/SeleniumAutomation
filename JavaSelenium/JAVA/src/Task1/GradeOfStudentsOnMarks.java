package Task1;

import java.util.Scanner;

public class GradeOfStudentsOnMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks:");
        marks = scanner.nextInt();
        if(marks>0&&marks<=100) {
        if (marks > 90) {
            System.out.println("The student grade is A+");
        } else if (marks <= 90 && marks > 80) {
            System.out.println("The student grade is A");
        } else if (marks <= 80 && marks > 70) {
            System.out.println("The student grade is B");
        } else if (marks <= 70 && marks > 60) {
            System.out.println("The student grade is C");
        } else if (marks <= 60 && marks > 50) {
            System.out.println("The student grade is D");
        } else if (marks <= 50 && marks > 40) {
            System.out.println("The student grade is E");
        } else if (marks <= 40) {
            System.out.println("The student grade is F");
        }
        }
        else
        {
            System.out.println("Enter the Marks between 0 and 100");
        }

    }
}

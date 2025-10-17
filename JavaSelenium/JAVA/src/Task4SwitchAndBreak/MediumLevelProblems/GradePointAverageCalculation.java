package Task4SwitchAndBreak.MediumLevelProblems;

import java.util.Scanner;

public class GradePointAverageCalculation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a letter grade (A, B, C, D, F): ");
        char grade = scanner.next().toUpperCase().charAt(0);
        switch(grade){
            case 'A' :
                System.out.println("Grade point : 4.0");
                break;
            case 'B' :
                System.out.println("Grade point : 3.0");
                break;
            case 'C' :
                System.out.println("Grade point : 2.0");
                break;
            case 'D' :
                System.out.println("Grade point : 1.0");
                break;
            case 'F' :
                System.out.println("Grade point : 0.0");
                break;
            default:
                System.out.println("Invalid Grade!. Please,Enter Valid Grade");


        }
    }
}

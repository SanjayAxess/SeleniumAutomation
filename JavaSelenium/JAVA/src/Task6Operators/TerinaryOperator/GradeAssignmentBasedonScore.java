package Task6Operators.TerinaryOperator;

import java.util.Scanner;

public class GradeAssignmentBasedonScore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the score:");
        double score=scanner.nextDouble();
        if(score<=100 && score>=0){
        String grade=(score>=90)?"A":((score>=80)?"B":(score>=70)?"C":(score>=60)?"d":(score>=50)?"e":"f");
        System.out.println(grade+" is the grade");
        }
        else {
            System.out.println("Enter the between 0 to 100");
        }
    }
}

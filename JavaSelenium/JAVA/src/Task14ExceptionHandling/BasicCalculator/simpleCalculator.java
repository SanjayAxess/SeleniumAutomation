package Task14ExceptionHandling.BasicCalculator;

import java.util.Scanner;

public class simpleCalculator{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try{
            System.out.println("Enter the First number : ");
            String s1= scanner.nextLine();
            double num1;
            try{
                num1=Double.parseDouble(s1);
            } catch (NumberFormatException e) {
                throw new InvalidInputException("Invalid input! Please enter a number.");
            }

            System.out.println("Enter the First number : ");
            String s2= scanner.nextLine();
            double num2;
            try{
                num2=Double.parseDouble(s2);
            } catch (NumberFormatException e) {
                throw new InvalidInputException("Invalid input! Please enter a number.");
            }

            System.out.print("Enter operation (+, -, *, /): ");
            char operation=scanner.next().charAt(0);

            double result=0;

            if(operation=='+'){
                result=num1+num2;
            } else if (operation == '-') {
                result=num1-num2;
            }else if (operation=='*'){
                result=num1*num2;
            }else if(operation=='/'){
                if(num2==0){
                    throw new ArithmeticException("Division by zero is not allowed!");
                }
                result=num1/num2;
            }else {
                throw new InvalidInputException("Invalid operation! Use +, -, *, or /.");
            }
            System.out.println("Result : "+result);

        }
        catch (InvalidInputException e){
            System.out.println("Error : "+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
    
}

package Task2ControlStatements.JumpStatements;

public class Continue {
    public static void main(String[] args) {
        //Write a program to print numbers from 1 to 10, but skip the number 5 using the continues statement
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }

    }
}

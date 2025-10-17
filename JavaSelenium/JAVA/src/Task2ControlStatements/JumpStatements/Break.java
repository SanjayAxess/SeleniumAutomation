package Task2ControlStatements.JumpStatements;

public class Break {
    public static void main(String[] args) {
        //Write a program to print numbers from 1 to 10, but stop the loop if the number is 5 using the breakstatement.
        for(int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
    }
}

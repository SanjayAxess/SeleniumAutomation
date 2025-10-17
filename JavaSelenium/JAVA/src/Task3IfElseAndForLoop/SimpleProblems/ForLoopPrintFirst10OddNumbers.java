package Task3IfElseAndForLoop.SimpleProblems;

public class ForLoopPrintFirst10OddNumbers {
    public static void main(String[] args) {
        System.out.println("The first 10 odd numbers are : ");
        for(int i=1;i<=10;i++){
            int odd=2*i-1;
            System.out.println(odd);
        }
    }
}

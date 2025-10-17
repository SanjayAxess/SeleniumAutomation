package Task3IfElseAndForLoop.MediumLevelProblems;

import java.util.Scanner;

public class ForLoopMartixAddition {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of Rows : ");
        int rows= scanner.nextInt();
        System.out.println("Enter the number of Cols : ");
        int cols= scanner.nextInt();

        int matrix1[][]= new int[rows][cols];
        int matrix2[][]= new int[rows][cols];
        int sumMatrix[][]= new int[rows][cols];

        //Input elements for matrix1
        System.out.println("Enter the elements for matrix1 :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Matrix1["+i+"]["+j+"]:");
                matrix1[i][j]= scanner.nextInt();

            }

        }

        //Input elements for matrix2
        System.out.println("Enter the elements for matrix2 :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Matrix2["+i+"]["+j+"]:");
                matrix2[i][j]= scanner.nextInt();
            }
        }

        //ADD of two matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sumMatrix[i][j]= matrix1[i][j]+matrix2[i][j];
            }
        }

        //Display Result
        System.out.println("Sum of the two matrices:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sumMatrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}

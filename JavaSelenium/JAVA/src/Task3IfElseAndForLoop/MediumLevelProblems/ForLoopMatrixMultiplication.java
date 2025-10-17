package Task3IfElseAndForLoop.MediumLevelProblems;

import java.util.Scanner;

public class ForLoopMatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //For multiplication colums of A equal to rows B

        //Enter the rows and cols in matrixA
        System.out.println("Enter the Number of Rows For MatrixA : ");
        int rowsA= scanner.nextInt();
        System.out.println("Enter the number of Cols For MatrixA : ");
        int colsA= scanner.nextInt();

        //Enter the rows and cols in matrixB
        System.out.println("Enter the Number of Rows For MatrixB : ");
        int rowsB= scanner.nextInt();
        System.out.println("Enter the number of Cols For MatrixB : ");
        int colsB= scanner.nextInt();

        // Check if multiplication is possible
        if(colsA!=rowsB){
            System.out.println("Multiplication is not Possible .");
            return;
        }


        int matrixA[][]= new int[rowsA][colsA];
        int matrixB[][]= new int[rowsB][colsB];
        int product[][]= new int[rowsA][colsB];

        //Input elements for matrixA
        System.out.println("Enter the elements for matrix1 :");
        for(int i=0;i<rowsA;i++){
            for(int j=0;j<colsA;j++){
                System.out.print("MatrixA["+i+"]["+j+"]:");
                matrixA[i][j]= scanner.nextInt();
            }
        }

        //Input elements for matrixB
        System.out.println("Enter the elements for matrix2 :");
        for(int i=0;i<rowsB;i++){
            for(int j=0;j<colsB;j++){
                System.out.print("MatrixB["+i+"]["+j+"]:");
                matrixB[i][j]= scanner.nextInt();
            }
        }

        for(int i=0;i<rowsA;i++){
            for(int j=0;j<colsB;j++){
                product[i][j]=0;
                for(int k=0;k<colsA;k++){
                    product[i][j]+=matrixA[i][j]*matrixB[i][j];

                }
            }
        }
        //Display the result
        System.out.println("Product of Matrix A and Matrix B:");
        for(int i=0;i<rowsA;i++){
            for(int j=0;j<colsB;j++){
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }
    }
}

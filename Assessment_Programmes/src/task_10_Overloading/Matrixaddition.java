package task_10_Overloading;


public class Matrixaddition {

    // Method to add two 2x2 matrices
    public static int[][] add(int[][] a, int[][] b) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Overloaded method to add two 3x3 matrices
    public static int[][] add(int[][] a, int[][] b, int size) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void display(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[][] m1_2x2 = { {1, 2}, {3, 4} };
        int[][] m2_2x2 = { {5, 6}, {7, 8} };

        int[][] m1_3x3 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] m2_3x3 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        System.out.println("Sum of 2x2 matrices:");
        int[][] sum2x2 = add(m1_2x2, m2_2x2);
        display(sum2x2);

        System.out.println("\nSum of 3x3 matrices:");
        int[][] sum3x3 = add(m1_3x3, m2_3x3, 3);
        display(sum3x3);
    }
}


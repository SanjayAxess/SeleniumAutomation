package Task10PolyMorphism.MethodOverLoading;

public class MatrixAddition {
    //Add two 2x2 Matrics
    public void add(int m1[][],int m2[][]){
        System.out.println("Addtion of Two 2x2 Matrics");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            System.out.print((m1[i][j]+m2[i][j])+" ");
           }
            System.out.println();
        }
    }
    // Add of two 3x3 Matrics
    public void add(double m1[][],double m2[][]){
        System.out.println("Addition of 3x3 matrix : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print((m1[i][j]+m2[i][j])+" ");
            }
            System.out.println();
        }
    }

    //Addtion 0f two matrix of any size
    public void addMatrix(int ma1[][],int ma2[][]){
        if (ma1.length != ma2.length || ma1[0].length != ma2[0].length) {
            System.out.println("Matrix sizes doesn't match.Addition is not possible");
            return;
        }
        System.out.println("Adding matrices of size " + ma1.length + "x" + ma1[0].length + ":");
        for(int i=0;i<ma1.length;i++){
            for(int j=0;j<ma1[0].length;j++){
                System.out.print((ma1[i][j]+ma2[i][j])+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixAddition ma = new MatrixAddition();
        int[][] mat2x2a = {{1, 2}, {3, 4}};
        int[][] mat2x2b = {{5,6}, {7,8}};
        ma.add(mat2x2a,mat2x2b);

        double[][] mat3x3a={{1.1,2.2,3.3}, {4.4,5.5,6.6}, {7.7,8.8,9.9}};
        double[][] mat3x3b={{9.9,8.8,7.7}, {6.6,5.5,4.4}, {3.3,2.2,1.1}};
        ma.add(mat3x3a,mat3x3b);

        int[][] matAnyA={{1,2,3},{4,5,6}};
        int[][] matAnyB={{6,5,4},{3,2,1}};
        ma.addMatrix(matAnyA,matAnyB);

    }
}

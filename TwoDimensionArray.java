public class TwoDimensionArray {
    int [][] matrix={{1,2,3,4,5},{6,7,8,9,0},{7,6,4,3,2}};
    public void ArrayMat()
    {
        for(int i=0;i< matrix.length;i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        TwoDimensionArray arm=new TwoDimensionArray();
        arm.ArrayMat();
    }
}

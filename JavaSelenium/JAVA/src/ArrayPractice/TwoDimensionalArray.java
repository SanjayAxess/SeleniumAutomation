package ArrayPractice;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //Two dimenesional array
        // 1.Declare an array
        // 2. Add Values into array
        // 3. Find size of an array
        // 4. Read single Value from an array
        // 5. Read multiple values from an array

        // 1.Declare an array
        //Approach-1
        /*int a[][]=new int[3][2];
        a[0][0]=100;
        a[0][1]=200;
        a[1][0]=300;
        a[1][1]=400;
        a[2][0]=500;
        a[2][1]=600;*/

        //Approach-2
        int a[][]={ {100,200,700},  {300,400,800},  {500,600,900} };

        //Find size of a an array
        System.out.println("Length of rows : "+a.length);
        System.out.println("Length of coloums : "+a[0].length);
        //read single value from an array
        System.out.println(a[1][1]);//op=400
        System.out.println(a[2][1]);//op=600

        //normal for loop (nested for loop)
//        for(int r=0;r<a.length;r++){
//            for(int c=0;c<a[r].length;c++){
//                System.out.print(a[r][c]+ " ");
//            }
//            System.out.println();
//        }


        //enhanced for loop
        for(int arr[]:a){
            for(int x:arr){
                System.out.print(x+ " ");
            }
            System.out.println();
        }






    }
}

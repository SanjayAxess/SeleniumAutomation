package ArrayPractice;

public class ArrayPractice {
    public static void main(String[] args) {
//        Single Dimensional array
//                1.Declare an array
//                2. Add Values into array
//                3. Find size of an array
//                4. Read single Value from an array
//                5. Read multiple values from an array
        //declaring an array
        //Aproach1
        //If we already know how many elecments have to store and how much data
        //don't want add values in future
        /*int a[]=new int[5];
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;
        System.out.println();*/
        //Approch2
        //if we don't know size of array and need to add in future
        int a[]={100,200,300,400,500};

        //find length of array
        System.out.println(a.length);

        //Read single value from an array
        System.out.println(a[4]);//here 4 is index
        System.out.println(a[2]);
        //Read all the values from array
      /*  for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            System.out.print(a[i]+" ");
        }*/
        //enhaced for loop/for each loop
        for(int x:a){
            System.out.println(x);
        }






    }
}

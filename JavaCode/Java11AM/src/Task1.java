public class Task1 {
    //int z = 10;
    //int a = 0, b = 1;
    int a = 527;
    int b = 0;
    int count;
    //int square;
    int sum;
    //int num;
    //Scanner sc = new Scanner(System.in);

//    public void fibonaci() {
//        System.out.println(a);
//        System.out.println(b);
//
//        for (int i = 2; i < z; i++) {
//            int next = a + b;
//            a = b;   // a = 1
//            b = next;  // b = 1
//            System.out.println(next);
//
//        }
//    }
//    public void addition(){ // n^2 + 1^2 + 2^2+.....
//        for (int i = 1; i <= a; i++){
//            //square = i * i;
//            //System.out.println("Square of " + i + "is " +square);
//            //sum += square;
//            b = b + (i*i);
//            System.out.println(b);
//        }
//        //System.out.println(" Sum of square " + num + "is" + sum +);
//    }
//    public void reverse2() {
//        while (a != 0){
//            int digit = a % 10;
//            b = b * 10 + digit;
//            a = a/10;
//        }
//        System.out.println("Reversed number is :" +b);
//    }
//    public void counttotal() {
//        while (a != 0){
//            a = a/10;
//            count++;
//        }
//        System.out.println("Total Digit :" +count);
//    }
    public void sumadd(){
        while (a != 0){
            sum = sum + a % 10;
            a = a/10;
        }
        System.out.println("Sum of Digit is :" +sum);
    }

    public void palindromes(){


    }

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        //t1.fibonaci();
        //t1.addition();
        //t1.reverse2();
        //t1.counttotal();
        t1.sumadd();
    }
}

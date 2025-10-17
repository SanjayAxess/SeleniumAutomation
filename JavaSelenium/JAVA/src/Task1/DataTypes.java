package Task1;

public class DataTypes {
    public static void main(String[] args) {
        //Numberic data type
        int a=100,b=100;
        System.out.println("The value of a is:"+a);
        System.out.println("The value of b is:"+b);
        System.out.println(a+b);
        System.out.println("the sum of a and b is:"+(a+b));

        int c=100;
        int d=-10;
        int result;
        System.out.println("The result is ;"+(result=(c+d)));

        int e=23,f=25;
        System.out.println("The result is ;"+(result=(e*f)));

        int num1=20,num2=40;
        result = num1+num2;
        System.out.println("The result is :"+result);
        result = num1-num2;
        System.out.println("The result is :"+result);
        result = num1*num2;
        System.out.println("The result is :"+result);

        int counter=5;
        System.out.println("Counter value is :"+counter);
        counter++;        //increament the value by 1 "post-increament"
        System.out.println("Counter value is post increament :"+counter);
        ++counter;        //increment value by 1"pre-increament"
        System.out.println("Counter value is pre increament :"+counter);
        counter--;        //decreament the value by 1 "post-decreament"
        System.out.println("Counter value is post decreament :"+counter);
        --counter;        //decreament the value by 1 "pre-decreament"
        System.out.println("Counter value is pre decreament :"+counter);

        byte by=121;
        System.out.println(by);

        short sh=2536;
        System.out.println(sh);

        long ln=245678439765l;  //l=literal
        System.out.println(ln);

        //decimal number data types
         float student_marks=99.5F; //F=for defining value in float data type we have to keep "F" in the value of the variable
        System.out.println(student_marks);

        double db=9876.5432010;
        System.out.println(db);

        //char date type=this is always represents single character
        char student_grade='B'; //we can define value in always in singe quotations
        System.out.println(student_grade);

        String my_name="Hussain";//we can define value in always in double quotations
        System.out.println("My Name is "+my_name);

        //boolean type=true or false
        boolean b1=true; //we can define directly without any quotations
        System.out.println(b1);



    }
}

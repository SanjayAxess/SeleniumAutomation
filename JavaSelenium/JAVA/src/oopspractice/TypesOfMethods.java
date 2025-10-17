package oopspractice;

public class TypesOfMethods {

    //1.No Params /No Argue   No Return Value
    void m1(){
        //Here void will keep we didn't any return type value
        //()==>indicates in side no parameets is there so we will say no paramenter/no arguement
        System.out.println("Hello....");
    }

    //2.No Params/No Argue      Return Value
    String m2() {
        //here instead of void we given String becoause
        //In the block it is return the value so we can't keep void
        //We have to have the data type in which return value type...if it is string then string,if integer then int
        return "Hello how are you?";
    }

    //3.Takes Params/Argues      No Return Value
    void m3(String name){
        //Here we didn't keep return so void will get'
        //now we take paramenter.so'String name' which is name is variable and String is datatype is inside the brackets() with data type
        //we use printlin and cancat the 'name' varialbe
        System.out.println("Hello "+name);
    }

    //4.Takes Params/Argue     Return Value
    String m4(String name){
        return("Hello "+name);
    }

    public static void main(String[] args) {
        TypesOfMethods type1=new TypesOfMethods();
        type1.m1();//1st type

        String s=type1.m2();//2nd type
        System.out.println(s);

        type1.m3("Hussain");//3rd Type

        String s1=type1.m4("Hari");//4th Type
        System.out.println(s1);
    }
}

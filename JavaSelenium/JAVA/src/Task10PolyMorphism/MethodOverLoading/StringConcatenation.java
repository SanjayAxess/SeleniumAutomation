package Task10PolyMorphism.MethodOverLoading;

public class StringConcatenation {

    public String concatenate(String str1,String str2){
        return str1+str2;
    }

    public String concatenate(String str,int number){
        return str+number;
    }

    public String concatenate(String str,boolean value){
        return str+value;
    }

    public String concatenate(String str,char ch){
        return str+ch;
    }

    public String concatenate(String str1,String str2,String str3){
        return str1+str2+str3;
    }

    public String concatenate(String str,Object obj){
        return str+obj.toString();
    }

    public static void main(String[] args) {
        StringConcatenation concat=new StringConcatenation();
        System.out.println(concat.concatenate("Hello ","Good Morning"));
        System.out.println(concat.concatenate("Roll Number : ",101));
        System.out.println(concat.concatenate("is Java Programming : ",true));
        System.out.println(concat.concatenate("Grade",'A'));
        System.out.println(concat.concatenate("This is ","Java ","Programming"));
          System.out.println(concat.concatenate("Object ",new java.util.Date()));
    }
}

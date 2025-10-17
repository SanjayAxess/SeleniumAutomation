package Task1;

public class StringMethodsPractice {
    public static void main(String[] args) {
        String name=" Hello Good Morning";
        System.out.println(name.length());//op=18...Prints the length of string charector including spaces
        System.out.println(name.charAt(6));//op=G..Prints position of charaxtor
        //if n=lenghth then n-1 is index,
        System.out.println(name.substring(6,10));//op=Good..extracts the substring from string
        System.out.println(name.concat(" How are you"));//0p=Hello Good Morning How are you....it add the statement to the existed string which is called concatination
        System.out.println(name.indexOf("Morning"));//op=11..it indicates the index of single charector
        System.out.println(name.indexOf("G"));//op=6..it indicates if we give string name,show starting index position of given character
        System.out.println(name.lastIndexOf("g"));//op=17..it prints the last index of string name
        System.out.println(name.contains("Hello"));//op=true..it prints boolean type which mean true or false for the condiation that a word or charector conatins in string or not
        System.out.println(name.matches(".*Good.*"));//op=true...it matches the string and give boolen type answer
        System.out.println(name.equals("Hello Good Morning"));//op=true..it checks if two string are equal then it prints boolean type output
        System.out.println(name.equals("hello Good Morning"));//op=false
        //now we can observe that last two methods first method is true and second method is false bcoz in second method the given string has 'h' instaed of 'H'
        System.out.println(name.equalsIgnoreCase("hello Good Morning"));//op=true
        //now it become true by using another method which 'equalsIgnoreCase'
        System.out.println("Good".compareTo("Good"));
        System.out.println("Hello".compareTo("Good"));
        System.out.println("Good".compareTo("Hello"));
        System.out.println("Good".compareTo("Morning"));
        System.out.println("Morning".compareTo("Good"));
        System.out.println(name.toLowerCase());//op=hello good morning..it prints the string in lowercase
        System.out.println(name.toUpperCase());//op=HELLO GOOD MORNING..it prints the string in uppercase
        System.out.println(name.trim()); //op=Hello Good Morning,it trims the spaces,tabs in the string start and end.
        System.out.println(name.replace('o','0'));//op=Hell0 G00d M0rning,it replaces the string charecters with the new charectors.
        System.out.println("".isEmpty());//op=true Checks if the string is empty.
        System.out.println("   ".isBlank());          // Output: true

        //concat(String str)
        String s1="My ",s2="World";
        System.out.println(s1.concat(s2)); //output=My World
        //startsWith(String prefix) / endsWith(String suffix)-Checks if the string starts or ends with a specific substring.
        System.out.println(name.startsWith(" Hello")); // Output: true
        System.out.println(name.endsWith("! "));// Output: false
        //


    }
}

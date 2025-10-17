package Task12Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> students=new LinkedHashMap<>();


        students.put(101,"Hussain");
        students.put(102,"Jothy");
        students.put(103,"Hari");
        students.put(104,"Kalyan");
        students.put(107,"Ajith");
        students.put(109,"Vijay");
        students.put(105,"Stalin");

        System.out.println("Student LinkedHashMap : "+students);

        // Print all roll numbers
        System.out.println("Student Roll Numbers : "+students.keySet());

        // Print all student names
        System.out.println("Student Names : "+students.values());

        //get students by roll numbers
        System.out.println("Student name with Roll number '103' : "+students.get(103));

        //Check if roll number exists--boolen
        System.out.println("Contains with Roll Number '106' ? "+students.containsKey(106));

        //check if student exists--boolen
        System.out.println("Contains the student name 'Sujeeth' ? "+students.containsValue("Sujeeth"));

        //iterating
        System.out.println("Iterating through LinkedHashMap : ");
        for(Map.Entry<Integer,String> stu:students.entrySet()){
            int roll=stu.getKey();
            String name=stu.getValue();
            System.out.println("Roll No : "+roll+"     Student Name : "+name);
        }

        //size of set
        System.out.println("Total students : "+students.size());



    }
}

package Basics;

import java.time.Clock;

public class BasicProgram {
    //variable - a container to store data
    //Initialisation
    //---
    //Variable type
    //Variable name
    //= -> Assignment Operator
    //Value
    //EOS - End of Statement

    //primitive data
    int a = 10;

    //Non- Primitive data
    public void display(){
        String s = "Hello";
        System.out.println(s);

    }


    public static void main(String[] args) {
        BasicProgram bp = new BasicProgram(); //object creation
        //system.out.println(s);
        bp.display();
    }
}

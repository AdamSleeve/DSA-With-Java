package DSA_Java_Revisions;

import java.util.Scanner;
public class StringExample {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = in.next();
        String naming = Greet("Adam");
        System.out.println(naming);
    }


    static String Greet(String name){
        String message = "Hello " + name;
        return message;
    }



}

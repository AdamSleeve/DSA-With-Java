package DSA_Java_Revisions;

import java.util.Scanner;
public class StringMethodName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        String ans = greet(name);
        System.out.println(ans);
    }
    static String greet(String name){
        String greeting = "Hello " + name;
        return greeting;
    }
}

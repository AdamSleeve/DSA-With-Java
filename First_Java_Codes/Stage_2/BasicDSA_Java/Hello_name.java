package BasicDSA_Java;

import java.util.Scanner;

public class Hello_name {
    public static void main(String[]args){
        System.out.println("What is your name: ");
        Scanner input =new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello " + name);
        System.out.println("How are you doing today?");

    }
}

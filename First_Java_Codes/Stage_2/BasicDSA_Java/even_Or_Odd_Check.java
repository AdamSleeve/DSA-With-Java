package BasicDSA_Java;

import java.util.Scanner;
// a program to print whether a number is even or odd, and also to take input from the user
public class even_Or_Odd_Check {
    public static void main(String[]args){
        System.out.print("Please input a number: ");

        Scanner input= new Scanner(System.in);
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is an even number");
        }else{
            System.out.println(num + " is an odd number");
        }
    }
}

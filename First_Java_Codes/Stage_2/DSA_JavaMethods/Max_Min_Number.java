package DSA_JavaMethods;

import java.util.Scanner;
public class Max_Min_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("welcome to java program to find the maximum and minimum of three numbers");

        System.out.print("Enter the first number ");
        int a = in.nextInt();

        System.out.print("Enter the second number ");
        int b = in.nextInt();

        System.out.print("Enter the third number ");
        int c = in.nextInt();


//        int max = a;
//        if(b > a){
//            max = b;
//        }
//        if(c > b){
//            max = c;
//        }
//
//        System.out.println("The maximum number is " + max);

        int min =a;
        if(b < a){
            min = b;
        }
        if (c< b){
            min = c;
        }
        System.out.println("The minimum number is " + min);
    }
}

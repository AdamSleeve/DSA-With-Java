package com.Adam;
//a method to output the sum of two numbers
import java.util.Scanner;

public class Sum_ii {
    public static void main(String[] args) {
        Method();
    }
        static void Method(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number ");
            int firstNum = sc.nextInt();

            System.out.println("Enter the second number ");
            int secondNum = sc.nextInt();

            int sum = firstNum + secondNum;
            System.out.println("The sum is: " + sum);
        }




}

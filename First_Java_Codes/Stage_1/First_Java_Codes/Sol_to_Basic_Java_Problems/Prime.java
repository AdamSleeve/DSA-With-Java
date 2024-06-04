package com.Adam;

import java.util.Scanner;
//input a number and print whether it is prime or not

public class Prime {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        if(num <= 1){
            System.out.println("Not composite or prime");
            return;
        }
        int c =2;
        while(c*c <= num){
            if(num % c ==0){
                System.out.println("Its not a prime number");
                return;
            }c+=1;
        }if(c*c > num){
            System.out.println(num + " "+ "is a prime number");
        }

    }
}
/*          8
* */


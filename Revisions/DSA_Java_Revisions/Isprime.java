package DSA_Java_Revisions;
//write a method to check whether a number is prime or not

import java.util.Scanner;
public class Isprime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Prime(num);
    }
    static void Prime(int num){
        if(num <= 1){
            System.out.println("Not composite or prime! ");
        }
        int c = 2;
        for(c = 2; c*c < num; c++){
            if(num % c == 0){
                System.out.println("Not prime");
                return;
            }

        }if (c*c > num){
            System.out.println("Is a prime number");
        }
    }
}

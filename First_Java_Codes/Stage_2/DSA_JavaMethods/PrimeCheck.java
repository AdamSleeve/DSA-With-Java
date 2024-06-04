package DSA_JavaMethods;

import java.util.Scanner;
//Define a method to find out if a number is prime or not.
public class PrimeCheck {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPrime(num);


    }
    static void isPrime(int num){
        if (num <= 1){
            System.out.println("Not prime! ");
        }
        int c = 2;
        for(c =2; c*c <=num; c++){
            if (num % c == 0){
                System.out.println("Not Prime Number! ");
                return;
            }
        }if(c*c > num){
            System.out.println("Its a prime number");
        }
    }
}

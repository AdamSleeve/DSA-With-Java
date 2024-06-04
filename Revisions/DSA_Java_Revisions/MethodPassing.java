package DSA_Java_Revisions;

import java.util.Scanner;

//write a method to create an array of integers, change the value at 0 index
//write a method to print hello world!
//write a method to take input of two numbers and print the sum
//overloading in java
//write a method to print AdamSleeve
//write a method to print true for prime numbers
//An Assignment for myself is to find the first 100 prime numbers

//write a method to sum up the first 10 numbers passed as input
public class MethodPassing {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int total = sc.nextInt();
        System.out.println(mySum(total));

    }
    static int mySum(int k){
        if(k>0) {
            return k + mySum(k -1);

        }else{
            return 0;
        }
    }

}



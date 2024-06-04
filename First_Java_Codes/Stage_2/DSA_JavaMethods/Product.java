package DSA_JavaMethods;

import java.util.Scanner;
//Define a method that returns the product of two numbers entered by user.
public class Product {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first nuumber: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println(Product(a, b));

    }
    static int Product(int a, int b){
        int product= a * b;
        return product;
    }
}

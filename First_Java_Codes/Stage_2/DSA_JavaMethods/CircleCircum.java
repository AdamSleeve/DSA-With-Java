package DSA_JavaMethods;
//Write a program to print the circumference and area
// of a circle of radius entered by user by defining your own method.

import java.util.Scanner;
public class CircleCircum {
    public static void main(String[] args){
        circle();


    }
    static void circle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius = sc.nextInt();

        System.out.println("The circumference of a circle is: " + 2* 3.142* radius);
        System.out.println("The area of a circle is " + 3.142* radius* radius);

    }
}

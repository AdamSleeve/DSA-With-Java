package DSA_Java_Revisions;

import java.util.Scanner;

//A method to print the circumference of a circle
public class CircleCircum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double ans = circumferece(radius);
        double result = radius(radius);
        System.out.println("The circumference of a circle is " + ans);
        System.out.println("The area of a circle is " + result);
    }

    static double circumferece(int radius) {
        double circumference = (2 * 3.142 * radius * radius);
        double area = (2 * 3.142 * radius);
        return circumference;

    }

    static double radius(int radius) {
        double area = (2 * 3.142 * radius);
        return area;

    }
}
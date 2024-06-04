package com.Adam;

//code to reverse a number
import java.util.Scanner;
public class intReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1234567;
        int ans = 0;

        while (num >0) {
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }
        System.out.print(ans);


    }
}

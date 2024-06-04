package BasicDSA_Java;

import java.util.Scanner;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class simpleInterest {
    public static void main(String[] args) {

        System.out.println("What is the principal value? ");
        Scanner principal =new Scanner(System.in);
        int P = principal.nextInt();

        System.out.println("What is the rate value? ");
        Scanner input =new Scanner(System.in);
        int R =input.nextInt();

        System.out.println("What is the value for time? ");
        Scanner time =new Scanner(System.in);
        int T = time.nextInt();

        System.out.println("The Simple Interest is equal to " + P*R*T/ 100);
    }
}

package BasicDSA_Java_II;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        System.out.println("input the three numbers: ");
        Scanner sc= new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//
//        max = a;
//        if (b > a){
//            max = b;
//        }
//        if (c > b){
//            max = c;
//        }
//
//        System.out.println(max);
//
//
//        max=0;
//        if (b>a){
//            max = b;
//        }
//        if (c > b){
//            max = c;
//        }
//        if(a > c){
//            max=a;
//        }

        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}

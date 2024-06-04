package DSA_JavaMethods;

import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[]args){
       check();
    }
    static void check(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is an even number");
        }else{
            System.out.println(num + " is an odd number");
        }
    }
}

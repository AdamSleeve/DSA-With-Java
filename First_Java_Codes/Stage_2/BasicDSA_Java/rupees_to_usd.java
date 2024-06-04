package BasicDSA_Java;

import java.util.Scanner;
//Input currency in rupees and output in USD.
public class rupees_to_usd {
    public static void main(String[] args){

        System.out.println("Enter Currency in Rupees");
        Scanner input =new Scanner(System.in);
        float currency= input.nextInt();

        System.out.println( currency + " equivalent to dollars is " + currency/83.45);
    }
}

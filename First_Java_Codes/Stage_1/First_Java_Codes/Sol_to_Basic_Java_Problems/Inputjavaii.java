package com.Sol_to_Basic_Java_Problems;
//code to output "your name is 'input' "
import java.util.Scanner;
public class Inputjavaii{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        System.out.println("Your name is " + input.nextLine());
    }
}


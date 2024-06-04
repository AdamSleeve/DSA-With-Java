package com.Adam;
//code to output "your rollno is 'input' "
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your roll number: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is" +" " + rollno);
    }
}

package DSA_JavaMethods;

import java.util.Scanner;

//Write a program that will ask the user to enter his/her marks (out of 100).
//Define a method that will display grades according to the marks entered as below:
public class Grade {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter you score: ");
        int m = sc.nextInt();
        marks(m);
    }
    static void marks(int m){
        if(m < 100){
            if(m >= 91){
                System.out.println("AA");
            }
            else if(m >= 81){
                System.out.println("AB");
            }
            else if(m >= 71){
                System.out.println("BB");
            }
            else if(m >= 61){
                System.out.println("BC");
            }
            else if(m >= 51){
                System.out.println("CD");
            }
            else if(m >= 41){
                System.out.println("DD");
            }
            else if(m <= 40){
                System.out.println("you failed! ");
            }
            else{
                System.out.println("grade not found");
            }
        }
        else{
            System.out.println("Inalid Score! ");
        }

    }

}

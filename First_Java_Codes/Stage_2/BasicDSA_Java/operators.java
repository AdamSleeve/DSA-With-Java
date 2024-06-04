package BasicDSA_Java;

import java.util.Scanner;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class operators {
    public static void main(String[]args){

        System.out.println("Input the first number: ");
        Scanner firstInput= new Scanner(System.in);
        int firstNum = firstInput.nextInt();

        System.out.println("Input the second number: ");
        Scanner secondInput = new Scanner(System.in);
        int secondNum = secondInput.nextInt();

        if(firstNum > secondNum){
            System.out.println(firstNum*2);
            return;
        }
        if(secondNum > firstNum){
            System.out.println(secondNum*2);
        }
    }
}

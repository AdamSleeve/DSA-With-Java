package Practice_II;

import java.util.Scanner;

public class Armstrong {
//To check whether an input is an Armstrong number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Arm(num);


    }

    //Armstrong Number
    static void Arm(int num){

        int originalNum = num;
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            int cube = rem*rem*rem;
            ans = ans + cube;
            num = num /10;

        }
        if(originalNum == ans){
            System.out.println("Is armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }

    }
}

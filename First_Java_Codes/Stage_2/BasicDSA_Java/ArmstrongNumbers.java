
package BasicDSA_Java;
import java.util.Scanner;
//Armstrong numbers are numbers like 153. such that the sum oof the multiplication of individual
// numbers is equal to the number
//This code outputs the Armstrong numbers between two intervals
public class ArmstrongNumbers {
    public static void main(String[] args) {

        System.out.println("Input the first number: ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Input the second number: ");
        Scanner sec= new Scanner(System.in);
        int b = sec.nextInt();

        for(int i=a; i<=b; i++){
            int num= i;
            int sum = 0;

            while(num > 0){
                int remainder = num% 10;
                sum = sum + (remainder*remainder*remainder);
                num= num/10;
            }
            if(sum == i){
                System.out.print(sum + ",  ");
            }

        }
    }
}

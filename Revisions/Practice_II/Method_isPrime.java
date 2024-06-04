package Practice_II;

import java.util.Scanner;

public class Method_isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ans = isPrime(sc.nextInt());
        System.out.println(ans);

    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        int c =2;
        while(c*c < n){
            if(n % 2 == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }

}

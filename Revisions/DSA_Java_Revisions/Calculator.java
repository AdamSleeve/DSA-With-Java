package DSA_Java_Revisions;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while(true){
            System.out.println("Input an operator");
            char op = sc.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                System.out.println("Input the first number");
                int fnum = sc.nextInt();
                System.out.println("Input the second number");
                int snum = sc.nextInt();


                    if(op == '+'){
                        ans = fnum + snum;
                    }
                    if(op == '-'){
                        ans = fnum - snum;
                    }
                    if(op == '*'){
                        ans = fnum * snum;
                    }
                    if(op == '/'){
                        if(snum != 0){
                            ans = fnum / snum;
                        }
                    }
                    if(op == '%'){
                        ans = fnum % snum;
                    }
            }else if (op == 'x' || op == 'X') {
                break;
            } else{
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }

    }
}

package DSA_JavaMethods;
//Write a program to print the sum of two numbers entered by user by defining your own method.

public class Sum {
    public static void main(String[] args){
        int ans = sum(37, 30);
        System.out.println(ans);
    }
    static int sum(int a, int b){
        int add = a + b;
        return add;
    }
}

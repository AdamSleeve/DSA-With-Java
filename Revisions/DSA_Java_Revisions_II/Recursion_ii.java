package DSA_Java_Revisions_II;


//finding the recursion between two numbers
public class Recursion_ii {
    public static void main(String[] args) {
        System.out.println("The sum of numbers between 5 and 10 is: " + sum(5, 10));

    }
    static int sum( int a, int b){
        if(b > a){
            return b + sum(a, b-1);
        }
        else{
            return a;
        }
    }
}

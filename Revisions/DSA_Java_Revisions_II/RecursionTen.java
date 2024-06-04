package DSA_Java_Revisions_II;

public class RecursionTen {
    public static void main(String[] args) {
        System.out.println("The sum of numbers 1- 10 = " + sum(10));
    }
    static int sum(int num){
        if(num > 0){
            return num + sum(num -1);
        }
        else{
            return 0;
        }
    }
}

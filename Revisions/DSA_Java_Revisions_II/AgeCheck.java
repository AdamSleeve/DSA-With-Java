package DSA_Java_Revisions_II;

public class AgeCheck {
    public static void main(String [] args){
        check(20);
    }
    static void check(int age){
        if(age >=18){
            System.out.println("You are eligible");
        }
        else{
            System.out.println("You are not eligible");
        }
    }
}

package BasicDSA_Java_II;
//output either a letter is uppercase or lowercase
import java.util.Scanner;

public class LetterCase {
    public static void main(String[] args) {

        System.out.println("Enter a letter: ");
        Scanner sc= new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lower case letter");
        }else{
            System.out.println("Upper case letter");
        }
    }
}

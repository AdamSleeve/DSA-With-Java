package DSA_Java_Revisions;

//check how many times number 7 occurs
public class Occurence {
    public static void main(String[] args) {
        int num = 234571737;

        int check = 0;
        while(num > 0){
            if( num % 10 == 3){
                check++;
            }
            num = num /10;
        }

        System.out.println(check);
    }
}

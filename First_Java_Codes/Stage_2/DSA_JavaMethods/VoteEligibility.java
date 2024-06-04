package DSA_JavaMethods;

import java.util.Scanner;
public class VoteEligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean vote = voteEli(23);
        System.out.println(vote);
    }

    static boolean voteEli(int v){
        return v>18;
    }
}

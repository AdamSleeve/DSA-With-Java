package otherPractices;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_ii {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(5);

        for(int i=0; i< 5; i++){
            list.add(sc.nextInt());
        }

        for(int i=0; i< 5; i++){
            System.out.print(list.get(i) + " ");
        }

    }
}

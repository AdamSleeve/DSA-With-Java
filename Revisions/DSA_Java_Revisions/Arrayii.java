package DSA_Java_Revisions;

import java.util.Scanner;

public class Arrayii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        arr = new int[]{1, 2, 3, 4, 5};
//        arr[0] = 23;
//        arr[1] = 223;
//        arr[2] = 233;
//        arr[3] = 243;
//        arr[4] = 2;

        System.out.println(arr[3]);

//for every element in an array,the the input of the elements
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
//for every element in the arrray, print the elements
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}

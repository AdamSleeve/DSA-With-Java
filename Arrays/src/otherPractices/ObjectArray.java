package otherPractices;

import java.util.Arrays;
import java.util.Scanner;

public class ObjectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[3][3];

        for(int i =0; i< arr.length; i++){
            for (int j=0; j< arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
//        for(int i =0; i< arr.length; i++){
//            for (int j=0; j< arr[i].length; j++){
//                System.out.println(arr[i][j]);
//            }
//        }


//        for(int i =0; i< arr.length; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }

        for(int[] element : arr){
            System.out.println(Arrays.toString(arr));
        }

    }

}

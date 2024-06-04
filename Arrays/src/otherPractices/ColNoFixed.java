package otherPractices;

import java.util.Arrays;
import java.util.Scanner;
public class ColNoFixed {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int[][] arr = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

//        for(int i = 0; i < 3; i++){
//            for(int j = 0; j< arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//
//        }

//        for(int i = 0; i < 3; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }

        for(int[] element : arr){
            System.out.println(Arrays.toString(element));


        }
    }
}

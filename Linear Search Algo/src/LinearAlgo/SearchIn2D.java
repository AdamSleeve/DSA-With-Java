package LinearAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2D {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        int[][] arr = {
                {2, 4, 6, 8},
                {10, 12, 14},
                {16, 18}
        };

        System.out.println("enter your target number");
        int target = 18;
        int[] ans = main(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] main(int[][] arr, int target){
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row, col};
                }

            }
        }
        return new int[]{-1, -1};
    }


    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];

                }

            }
        }
        return max;
    }

}

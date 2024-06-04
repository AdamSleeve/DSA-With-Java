package LinearAlgo;

import java.util.Arrays;

public class SearchIn2D_Arrays {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 6, 8},
                {10, 12, 14},
                {16, 18}
        };
        int target = 1;
        int[] ans = main(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] main(int[][] arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(target == arr[row][col]){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

package Practice_II;

import java.util.Arrays;

public class Methodiv {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,};
        message(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void message(int[] ar){
        ar[0] = 99;
    }
}

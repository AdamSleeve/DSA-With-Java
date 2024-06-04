package commClassroom;

import java.util.Arrays;
public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = { 24, 4, 5, 8, 20, 18};
//        System.out.println(MaxVal(arr, 1, 4));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
// code to iterate over the array list
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;

        }
    }


    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
//    static int swap(int[] arr, int start,int end){
//        int max = arr[start];
//        for (int i = start; i <= end; i++) {
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }
}

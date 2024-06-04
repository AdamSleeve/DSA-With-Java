package otherPractices;

import java.util.Arrays;
import java.util.Scanner;
public class IntArrays {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int[] IntArray = new int[5];
//        IntArray[0] = 23;
//        IntArray[1] = 24;
//        IntArray[2]=  25;
//        IntArray[3] = 26;
//        IntArray[4] = 27;
        //how to take arrays from terminal?
        //ans: I have to iterate over the array before printing it

        for(int i= 0; i< 5; i++){
            IntArray[i] = sc.nextInt();

        }

//        for(int i= 0; i< IntArray.length; i++) {
//            System.out.print(IntArray[i] + " ");
//        }
        for (int i: IntArray){
            System.out.println(Arrays.toString(IntArray));
        }
    }
}

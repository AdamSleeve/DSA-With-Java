package LinearAlgo;

import java.util.Arrays;
public class EvenNumber {
    public static void main(String[] args) {
    int[] arr = {23, 4, 2, 10};

        System.out.println(findNums(arr));
    }
// this code calls the 'isEven' method and counts the number of even numbers-> count++
    static int findNums(int[] arr){
        int count = 0;
        for(int num : arr){
            if(isEven(num)){
                count++;
            }
        }
        return count;
    }
    //this runs the code for a particular digit and checks if it is even
    static boolean isEven(int num){
        int NumberOfDigit = digits(num);
        return (NumberOfDigit % 2 == 0);
    }

//for every num in the arr, the code counts if (e.g 2237 is even -> isEven) and increments count.
    static int digits(int num){
        int count =0;
        while(num >0){
            count++;
            num = num/10;
        }
        return count;
    }
}

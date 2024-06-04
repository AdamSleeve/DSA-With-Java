package LinearAlgo;

import java.util.Arrays;
public class EvenNumber {
    public static void main(String[] args) {
    int[] arr = {23, 4, 2, 10};

        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr){
        int count = 0;
        for(int num : arr){
            if(isEven(num)){
                count++;
            }
        }
        return count;
    }
    static boolean isEven(int num){
        int NumberOfDigit = digits(num);
        return (NumberOfDigit % 2 == 0);
    }


    static int digits(int num){
        int count =0;
        while(num >0){
            count++;
            num = num/10;
        }
        return count;
    }
}

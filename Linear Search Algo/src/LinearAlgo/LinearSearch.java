package LinearAlgo;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {21, 2, 4, 6, 44, 42, 23, 91, 71};
        int ans = AlgoSearch(arr, 2);
        System.out.println(ans);

    }
    //want to use the length of the array here as a parameter
    //target as a parameter for a value

    static int AlgoSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}

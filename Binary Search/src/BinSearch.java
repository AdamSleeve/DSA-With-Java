public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {-9, -8, -6, -4, -1, 0, 4, 5, 9, 14, 24, 36, 94};
        int target = -8;
        int ans = Search(arr, target);
        System.out.println(ans);
    }

    static int Search(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;


        if (target < arr[mid]){
            end = mid - 1;
        }

        else if(target > arr[mid]){
            start = mid + 1;
        }
        else{
            return mid;
        }
        }
        return -1;
    }
}

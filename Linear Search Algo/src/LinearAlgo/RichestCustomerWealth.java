package LinearAlgo;
//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {
    public static void main(String[] args){
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};

        int fans = maximumWealth(accounts);
        System.out.println(fans);
    }
    static int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
        /*Assume that i = persons
                      j = each persons bank wealth
                      this is just to keep the code neat and simple

         */
        for(int[] i : accounts){
            int sum = 0;
            for(int j : i){
                sum += j;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}

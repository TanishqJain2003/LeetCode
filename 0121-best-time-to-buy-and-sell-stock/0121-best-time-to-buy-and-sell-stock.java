class Solution {
    public int maxProfit(int[] arr) {
      int profit = 0;
      int mini = Integer.MAX_VALUE;
      for(int i = 0 ; i < arr.length ; i++){
        profit = Math.max(profit ,  arr[i] - mini);
        mini = Math.min(mini , arr[i]);
      } 
      return profit; 
    }
}
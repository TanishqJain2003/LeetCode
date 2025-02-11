class Solution {
    public int findNumbers(int[] nums) {
        int evencount = 0;
        for(int i = 0; i< nums.length ; i++){
            if(digitcount(nums[i])%2==0){
                evencount++; 
            }
                }
                return evencount;
            }


        static int digitcount(int nums){
            int count = 0;
             while(nums!=0){
                 nums = nums/10;
                 count++;
             }
             return count;
        }
        }


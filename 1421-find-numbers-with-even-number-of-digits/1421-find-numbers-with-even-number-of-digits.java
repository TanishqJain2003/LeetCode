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
            if(nums<0){
                nums=nums*-1;
            }
            return(int)(Math.log10(nums)) +1;
        }
        }


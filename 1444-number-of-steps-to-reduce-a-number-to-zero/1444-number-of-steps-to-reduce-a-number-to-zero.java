class Solution {
    public int numberOfSteps(int num) {
        int m = 0;
        if(num==0){
            return m;
        }
        if(num%2==1){
            return numberOfSteps(num-1)+1;
        }
        else{
            return numberOfSteps(num/2)+1;
        }
    }
}
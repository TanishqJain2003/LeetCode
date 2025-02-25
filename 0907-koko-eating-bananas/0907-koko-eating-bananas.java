class Solution {
    public boolean isValid(int[] piles, int h, int bananas){
        int hours = 0;
        for(int i = 0; i < piles.length; i++){
            hours += Math.ceil((double) piles[i] / bananas);
        }
        return hours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int s = 1;
        int e = -1;
        for(int i = 0; i < n; i++){
            e = Math.max(e , piles[i]);
        }
        if(n == h) return e;
        int ans = 0;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(isValid(piles, h, m)){
                ans = m;
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return ans;
    }
}



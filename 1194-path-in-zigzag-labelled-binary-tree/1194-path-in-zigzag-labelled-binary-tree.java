class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> ans = new ArrayList<>();
        if(label==1){
            ans.add(1);
            return ans;
        }
        
        while(label!=1){
            ans.add(label);
            int level = (int)(Math.log(label)/Math.log(2)) + 1;
            if(level%2==0){
                int dist = (int)Math.pow(2, level)-1-label;
                int num = (int)Math.pow(2, level-1)+dist;
                label = num/2;
            }else{
                int dist = label-(int)Math.pow(2, level-1);
                int num = (int)Math.pow(2,level)-1-dist;
                label = num/2;
            }
        }
        ans.add(label);
        Collections.reverse(ans);
        return ans;
    }
}
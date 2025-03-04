class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length ;
        for(int i =0; i< n ; i++){
            for(int j =0 ; j< m ; j++){
                if(mat[i][j]==target){
                    return true;
                }
            }
        }
    return false;
    }
    
}
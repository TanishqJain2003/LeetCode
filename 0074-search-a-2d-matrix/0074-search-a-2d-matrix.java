class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length ;
        int low = 0;
        int high = n*m-1;
        while(low <= high){
            int mid = (low + high)/2;
            int row = mid /m;
            int col = mid % m;
            if(mat[row][col] == target){
                return true;
            }
            else if(mat[row][col] < target){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
           
        }
    return false;
    }
    
}
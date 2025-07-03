class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length; // Correct way to get number of columns

        int[] rows = new int[n];
        int[] col = new int[m];

        // First pass: identify rows and columns to be zeroed
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Second pass: set matrix cells to zero based on identified rows/columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rows[i]==1 || col[j]==1 ) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

        

            
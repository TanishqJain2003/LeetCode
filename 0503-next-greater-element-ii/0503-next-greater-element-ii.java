class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = -1;

            // Search the next n - 1 elements using circular indexing
            for (int j = 1; j < n; j++) {
                int idx = (i + j) % n;
                if (arr[idx] > arr[i]) {
                    res[i] = arr[idx];
                    break;
                }
            }
        }

        return res;
    }
}

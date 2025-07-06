import java.util.*;

class Solution {
    public int[][] merge(int[][] arr) {
        if (arr == null || arr.length == 0) return new int[0][];
        
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> mergedList = new ArrayList<>();

        for (int[] interval : arr) {
            if (mergedList.isEmpty() || interval[0] > mergedList.get(mergedList.size() - 1)[1]) {
                mergedList.add(interval);
            } else {
                mergedList.get(mergedList.size() - 1)[1] =
                    Math.max(mergedList.get(mergedList.size() - 1)[1], interval[1]);
            }
        }

        // Convert List<int[]> to int[][]
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}

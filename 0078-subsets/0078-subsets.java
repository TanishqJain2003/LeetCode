class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
          findSubsets(nums.length - 1, nums, new ArrayList<>(), result);
          return result;
    }
    public void findSubsets(int idx, int[] nums, List<Integer> subset, List<List<Integer>>result) {
        if(idx < 0){
          result.add(new ArrayList<>(subset));
          return;
        }
        // include current number
        subset.add(nums[idx]);
        findSubsets(idx - 1, nums, subset , result);

        // Backtrack: remove it
        subset.remove(subset.size() - 1);

        // Exclude current number
        findSubsets(idx - 1, nums, subset , result);
    }
}
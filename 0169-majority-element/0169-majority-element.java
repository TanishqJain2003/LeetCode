class Solution {
//     public int majorityElement(int[] nums) {
//         // Arrays.sort(nums);
//         // int n = nums.length;
//         // return nums[n/2];
//         int cnt = 0;
//         int el = 0;
//         int n = nums.length;
//         for(int i = 0; i<n; i++){
//         if(cnt == 0){
//             cnt = 1;
//             el = nums[i];
//         }
//         else if(el == nums[i]){
//             cnt++;
//         }
//         else cnt--;
//         }

//         int cnt1 = 0;
//         for(int i = 0; i < n; i++){
//          if(el == nums[i]){
//             cnt1++;
//          }
//          if(cnt1 > (n/2)){
//             return el;
//          }
//          return -1;
//         }
//     }
// }
public int majorityElement(int[] nums) {
    int cnt = 0;
    int el = 0;
    int n = nums.length;

    // Phase 1: Find a candidate
    for (int i = 0; i < n; i++) {
        if (cnt == 0) {
            cnt = 1;
            el = nums[i];
        } else if (el == nums[i]) {
            cnt++;
        } else {
            cnt--;
        }
    }

    // Phase 2: Verify the candidate
    int cnt1 = 0;
    for (int i = 0; i < n; i++) {
        if (nums[i] == el) {
            cnt1++;
        }
    }

    if (cnt1 > n / 2) {
        return el;
    }

    return -1; // No majority element
}
}

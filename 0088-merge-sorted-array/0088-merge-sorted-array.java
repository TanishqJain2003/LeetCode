class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;        
        int p2 = n - 1;         
        int p = m + n - 1;     
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If nums2 still has elements, copy them
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int left = n-1;
//         int right = 0;
//         while(left > 0 && right < n){
//             if(nums1[left] > nums2[right]){
//                 int temp = nums1[left];
//                 nums1[left] = nums2[right];
//                 nums2[right] = temp;
//                 left--;
//                 right++;
//             }
//             else{
//                 break;
//             }
//         }
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//     }
// }





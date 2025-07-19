class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int res[]=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i])st.pop();
            st.push(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i])
            st.pop();
            if(!st.isEmpty() && st.peek()>nums[i])res[i]=st.peek();
            else if(st.isEmpty())res[i]=-1;
            st.push(nums[i]);
        }
        return res;
    }
}
// class Solution {
//     public int[] nextGreaterElements(int[] arr) {
//         int n = arr.length;
//         int[] res = new int[n];

//         for (int i = 0; i < n; i++) {
//             res[i] = -1;

//             // Search the next n - 1 elements using circular indexing
//             for (int j = 1; j < n; j++) {
//                 int idx = (i + j) % n;
//                 if (arr[idx] > arr[i]) {
//                     res[i] = arr[idx];
//                     break;
//                 }
//             }
//         }

//         return res;
//     }
// }

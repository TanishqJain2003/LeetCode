// class Solution {
//     public int findDuplicate(int[] arr) {
//         int i = 0;
//         while ( i < arr.length){
//             if(arr[i]!= i+1){
//                 int correct = arr[i]-1;
//                 if(arr[i] != arr[correct]){
//                     swap(arr, i , correct);
//                 }
//                 else{
//                     return arr[i];
//                 }
//             }
//                 else{
//                     i++;
//                 }
//         }
            
//             return -1;
//     }
    
//         void swap(int[] arr , int first , int second){
//             int temp = arr[first];
//             arr[first]= arr[second];
//             arr[second] = temp;
//         }
// }
class Solution {
    public int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        while(slow != fast);
        fast = arr[0];
         while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
         }
     return slow;
    }

}

        
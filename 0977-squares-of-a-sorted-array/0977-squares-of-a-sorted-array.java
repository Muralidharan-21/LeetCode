class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int[] res = new int[n];
        int p = n-1;

        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                res[p--] = nums[left]  * nums[left++];
            }
            else{
                res[p--] = nums[right] * nums[right--];
            }
        }

        return res;
    }
}












// class Solution {
//     public int[] sortedSquares(int[] nums) {

//         int n = nums.length;
//         int arr[]  = new int[n];
//         int left = 0;
//         int right = n-1;
//         int pos = n-1;

//         while(left<=right){

//             if( Math.abs(nums[left])>Math.abs(nums[right]) ){
//                 arr[pos--] = nums[left]*nums[left];
//                 left++;
//             }
//             else{
//                 arr[pos--] = nums[right] * nums[right];
//                 right--;
//             }
            

            
//         }
//         return arr;
        
//     }
// }
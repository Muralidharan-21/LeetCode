class Solution {
    public int longestOnes(int[] nums, int k) {

        int zc= 0;
        int left = 0;
        int max = 0 ;

        for(int right = 0 ; right<nums.length ;right++){
            if(nums[right]!=1){
                zc+=1;
            }
            while(zc>k){
                if(nums[left]==0){
                    zc--;
                }
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;


        
    }
}







// class Solution {
//     public int longestOnes(int[] nums, int k) {

//         int zero_count = 0;
//         int left = 0;
//         int res = 0;

//         for (int right=0 ;right<nums.length ;right++){
            
//             if(nums[right]!=1){
//                 zero_count++;
//             }
//             while(zero_count>k){
//                 if(nums[left]==0){
//                     zero_count--;
//                 }
//                 left++;
//             }
//             res = Math.max(res,right-left+1);
//         }

//         return res;
        
//     }
// }
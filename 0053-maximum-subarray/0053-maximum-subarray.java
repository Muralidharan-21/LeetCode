class Solution {
    public int maxSubArray(int[] nums) {

        // if(nums.length==1){
        //     return nums[0];
        // }

        int res = Integer.MIN_VALUE;
        int curr_sum = 0;

        for(int i = 0; i<nums.length ;i++){
            curr_sum+=nums[i];

            res = Math.max(curr_sum,res);


            if(curr_sum<0){
                curr_sum = 0;
            }

           
        }
        return res;
        
    }
}






// class Solution {
//     public int maxSubArray(int[] nums) {

//         int n = nums.length;
//         int max = Integer.MIN_VALUE;
//         int sum = 0;

//         for(int i = 0 ; i<n ; i++){

//             sum = Math.max(nums[i],sum+nums[i]);
//             max = Math.max(sum,max);

            
//         }

//         return max;
        
//     }
// }
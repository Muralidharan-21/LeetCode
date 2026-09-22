class Solution {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int res = 0;
        for(int i = 0; i<nums.length;i+=2){
            res+=nums[i];
        }
        return res;
        
    }
}






// class Solution {
//     public int arrayPairSum(int[] nums) {

//         int res = 0;
//         Arrays.sort(nums);

//         for(int i = 0;i<nums.length; i+=2){
//             res+=nums[i];
//         }
//         return res;


        
//     }
// }
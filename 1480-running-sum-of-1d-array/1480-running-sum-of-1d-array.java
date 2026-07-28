class Solution {
    public int[] runningSum(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        int p = 0;
        for(int i = 0; i<n;i++){
            res[i] = nums[i]+p;
            p+=nums[i];
        }
        
    ;
        return res;
    }
}
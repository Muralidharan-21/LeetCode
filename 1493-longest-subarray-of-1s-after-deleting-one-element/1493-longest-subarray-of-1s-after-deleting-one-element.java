class Solution {
    public int longestSubarray(int[] nums) {

        int zc = 0;
        int left = 0;
        int ans = 0;

        for(int right = 0; right<nums.length;right++){
            if(nums[right]!=1){
                zc++;
            }
            while(zc>1){
                if(nums[left]==0){
                    zc--;
                }
                left++;
            }
            ans = Math.max(ans,right-left+1);

        }
        return ans-1;
        
    }
}
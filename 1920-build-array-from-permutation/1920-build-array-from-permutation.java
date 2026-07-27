class Solution {
    public int[] buildArray(int[] nums) {

        int ans[] = new int[nums.length];

        Arrays.fill(ans,0);

        for(int i=0 ; i<nums.length ;i++){
            ans[i] = nums[nums[i]];
        }
        
        return ans;
    }
}
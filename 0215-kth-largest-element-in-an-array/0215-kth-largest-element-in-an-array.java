class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        int res = 0;
        int right  = nums.length-1;
        while(k!=1){
            right--;
            k--;
        }
        return nums[right];

    }
}
class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int vote = 0;
        int n = nums.length;

        for(int i = 0; i<nums.length ; i++){
            if(vote == 0){
                candidate = nums[i];
                vote = 1;
                
            }
            else if(nums[i]==candidate){
                vote++;
            }
            else{
                vote--;
            }
        } 

        return candidate;
        
    }
}
class Solution {
    public int largestInteger(int[] nums, int k) {

        int[] count = new int[51];
        int n = nums.length;

        for(int start = 0 ; start<=n-k ;start++){

            boolean[] seen = new boolean[51];
            
            for(int s = start ; s < start+k ; s++){

                if(!seen[nums[s]]){
                    count[nums[s]]++;
                    seen[nums[s]] = true;
                }
            }
        }

        int ans = -1;

        for(int x = 0 ; x<51 ;x++){
            
            if(count[x]==1){
                ans = Math.max(ans,x);
            }

        }
        return ans;
        
    }
}
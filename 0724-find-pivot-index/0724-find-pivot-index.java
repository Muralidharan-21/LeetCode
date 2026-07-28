class Solution {
    public int pivotIndex(int[] nums) {


        int n = nums.length;
        int left[] =new int[n];
        int right[] =new int[n];

        int p = 0;
        for(int i = 0;i<n;i++){
            left[i] = p;
            p+=nums[i];
        }
        int s = 0;
        for(int i = n-1;i>=0 ;i--){
            right[i] = s;
            s+=nums[i];
        }

        for(int i=0;i<n;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
        
    }
}
class Solution {
    public int maxProduct(int[] nums) {

        int l = 0;
        int s = 0;

        for(int x : nums){
            if(x>l){
                s = l;
                l = x;
            }
            else if(x > s){
                s = x;
            }
        }
        return (s-1)*(l-1);
        
    }
}
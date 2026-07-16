class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        int m = 0;
        for(int n : nums){
            m = Math.max(m,n);
            set.add(n);
        }

        for(int i=1;i<m+2;i++){
            if(!set.contains(i*k)){
                return i*k;
            }
        }
        return 0;
    }
}
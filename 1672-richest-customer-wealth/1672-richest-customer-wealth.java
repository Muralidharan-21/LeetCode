class Solution {
    public int maximumWealth(int[][] accounts) {

        int max = 0;
        
        for(int[] arr : accounts){
            int temp  = 0 ;
            for(int x : arr){
                temp+=x;
            }
            max = Math.max(temp,max);
        }

        return max;
    }
}
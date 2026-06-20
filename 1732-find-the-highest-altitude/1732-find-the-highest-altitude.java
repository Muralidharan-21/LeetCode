class Solution {
    public int largestAltitude(int[] gain) {

        int max = 0;

        int g = 0;

        for(int i : gain){
            g+=i;
            max = Math.max(max,g);
        }
        return max;

        
    }
}
class Solution {
    public int longestContinuousSubstring(String s) {

        int max = 1;
        int c = 1;

        for(int i =1 ;i<s.length() ; i++){
            if(s.charAt(i)-s.charAt(i-1)==1){
                c++;
                max = Math.max(c,max);
            }
            else{
                c = 1;
            }
        }
        return max;
        
    }
}
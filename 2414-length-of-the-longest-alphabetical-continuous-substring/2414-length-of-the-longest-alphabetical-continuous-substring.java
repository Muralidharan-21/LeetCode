class Solution {
    public int longestContinuousSubstring(String s) {

        char l_c = '0';

        int max = 1;
        int c = 1;

        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)-l_c == 1){
                c++;
                l_c = s.charAt(i);
                max = Math.max(c,max);
            }
            else{
                l_c = s.charAt(i);
                c = 1;
            }

        }
        return max;
        
    }
}
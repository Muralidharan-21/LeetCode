class Solution {
    public boolean repeatedSubstringPattern(String s) {


        int n = s.length();

        for(int len = 1 ; len < n ; len++){

            if(n%len != 0){
                continue;
            }

            String ss = s.substring(0,len);

            StringBuilder res = new StringBuilder();

            while(res.length()  < n){
                res.append(ss);
            }

            if(res.toString().equals(s)){
                return true;
            }

        }
        return false;
        
    }
}
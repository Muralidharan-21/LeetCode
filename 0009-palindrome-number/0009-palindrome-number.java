class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        else{
            int temp = 0;
            int o = x;
            while(x!=0){
                int ld = x%10;
                temp = temp * 10 + ld;
                x/=10;
            }
            return temp == o;
        }
        
    }
}
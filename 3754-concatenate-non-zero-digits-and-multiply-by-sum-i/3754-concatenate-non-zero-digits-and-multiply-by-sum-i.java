class Solution {
    public long sumAndMultiply(int n) {

        long nn = 0;
        long t = n;
        long s = 0;
        while(t>0){
            s+=t%10;
            t=t/10;
            
        }

        while(n>0){
            long temp = n%10;
            if(temp!=0){
            nn = nn*10 + temp; 
            }
            n = n/10;
        }
        
        long res = 0;

        while(nn>0){
            long temp = nn%10;
            res = res * 10 + temp;
            nn = nn/10;
        }

        return res * s;
        
    }
}
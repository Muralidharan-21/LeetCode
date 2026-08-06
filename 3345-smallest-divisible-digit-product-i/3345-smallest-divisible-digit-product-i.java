class Solution {
    public int smallestNumber(int n, int t) {


        if(prod(n)%t == 0){
            return n;
        }
        else{
            for(int i = n ; i<=100 ;i++){
                if(prod(i)%t == 0){
                    return i;
                }    
            }
        }

        return n;

        
    }

    public int prod(int x){
        int p = 1;
        while(x!=0){
            p*=x%10;
            x/=10;
        }
        return p;
    }
}
class Solution {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int res = 0;
        
        for(int i = 0 ; i<prices.length ;i++){

            int cur = prices[i]-min;
            if(cur>res){
                res = cur;
            }
            if(prices[i]<min){
                min = prices[i];
            }

        }

        return res;
        
    }
}
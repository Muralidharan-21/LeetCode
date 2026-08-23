class Solution {
    public int climbStairs(int n) {

        int[] dp = new int[n+1];
        return solve(n,dp);
        
    }

    private int solve(int num,int dp[]){

        if(num == 1){
            return 1;
        }
        if(num == 2){
            return 2;
        }

        if(dp[num]!=0){
            return dp[num];
        }

        dp[num] =  solve(num-1,dp) + solve(num-2,dp);
        return dp[num];

    }
}
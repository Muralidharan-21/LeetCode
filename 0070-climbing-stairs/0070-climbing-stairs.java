class Solution {
    public int climbStairs(int n) {


        if(n<=1){
            return n;
        }
        int[] dp = new int[n+1];

        

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3 ; i<=n ;i++){
            dp[i] = dp[i-1]+ dp[i-2];
        }
        return dp[n];
    }
}



// Memorization
// class Solution {
//     public int climbStairs(int n) {

//         int[] dp = new int[n+1];
//         return solve(n,dp);
        
//     }

//     private int solve(int num,int dp[]){

//         if(num == 1){
//             return 1;
//         }
//         if(num == 2){
//             return 2;
//         }

//         if(dp[num]!=0){
//             return dp[num];
//         }

//         dp[num] =  solve(num-1,dp) + solve(num-2,dp);
//         return dp[num];

//     }
// }
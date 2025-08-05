// //Memoization
// class Solution {
//     public static int fibonacci(int n,int[] dp){
//         if(n<=1) return n;
//         if(dp[n]!=-1) return dp[n];
//         return dp[n] = fibonacci(n-1,dp)+fibonacci(n-2,dp);
//     }
//     public int fib(int n) {
//         int[] memoization = new int[n+1];
//         Arrays.fill(memoization,-1);
//         return fibonacci(n,memoization);
//     }
// }

//Tabulation
class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        if(n <= 1){
            return n;
        }
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
class Solution {
    public int numTilings(int n) {
        if(n==1)return 1;
        if(n==2)return 2;
        long prev3=1;//dp[0]
        long prev2=1;//dp[1]
        long prev1=2;//dp[2]

        for(int i=3;i<=n;i++){
            long current=(2*prev1+prev3)%1000000007;

            prev3=prev2;
            prev2=prev1;
            prev1=current;

        }
    return (int)prev1;
    }
}

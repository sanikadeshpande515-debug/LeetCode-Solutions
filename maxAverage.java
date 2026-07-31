class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int i=0;
        int j=0;
        int maxSum=Integer.MIN_VALUE;

        while(j<nums.length){
            sum=sum+nums[j];

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                maxSum=Math.max(maxSum,sum);
                sum=sum-nums[i];
                i++;
                j++;
            }
        }
        return (double) maxSum/k;

        
    }
}

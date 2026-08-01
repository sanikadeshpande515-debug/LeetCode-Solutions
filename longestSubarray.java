class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int maxLength=0;
        int zeroCount=0;

        while(j<nums.length){
            if(nums[j]==0){
                zeroCount++;
            }
            if(zeroCount<=1){
                maxLength=Math.max(maxLength,j-i+1);
                j++;

            }
            else if(zeroCount>1){
                while(zeroCount>1){
                    if(nums[i]==0){
                        zeroCount--;
                    }
                    i++;

                }
                maxLength=Math.max(maxLength,j-i+1);
                j++;


            }
        
        }
        return maxLength-1;
    }
}

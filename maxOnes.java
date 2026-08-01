class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int maxLength=0;
        int zeroCount=0;

        while(j<nums.length){
            if(nums[j]==0){
                zeroCount++;
            }
            if(zeroCount<=k){
                maxLength=Math.max(maxLength,j-i+1);
                j++;
            }
            else if(zeroCount>k){
                while(zeroCount>k){
                    if(nums[i]==0){
                        zeroCount--; 
                        
                    }
                    i++;
                }
                    
                    maxLength=Math.max(maxLength,j-i+1);

                    
                j++;
                }

            }
                return maxLength;
        }
       ;
    }

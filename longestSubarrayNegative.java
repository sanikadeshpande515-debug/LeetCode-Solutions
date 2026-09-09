import java.util.*;
class Solution {
    public int longestSubarray(int[] nums, int k) {
        HashMap<Long,Integer> preSumMap=new HashMap<>();
        preSumMap.put(0L,-1);
        int maxLen=0;
        long sum=0;

        for(int i=0; i<nums.length;i++){
            sum+=nums[i];

            long rem =sum-k;

            if(preSumMap.containsKey(rem)){
                int len =i-preSumMap.get(rem);
                maxLen=Math.max(maxLen,len);
            }

            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum, i);
            }
        }

        return maxLen;

       
    }
}

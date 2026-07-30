class Solution {
    public int maxOperations(int[] nums, int k) {
        int left=0;
        int right=nums.length-1;
        int i=0;
        int count=0;
        Arrays.sort(nums);
        while(left<right){
            if(nums[left]+nums[right]==k) {
                count++;
                left++;
                right--;
                
            }
            else if(nums[left]+nums[right]>k && nums[left]<nums[right]){
                right--;
            }
            else{
                left++;
            }

        }
        return count;
        
    }
}

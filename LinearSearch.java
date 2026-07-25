package org.nmiet;

public class Solution4 {
	public static void main(String []args) {
		int [] arr= {1,2,3,4,5};
		System.out.print("Element found at index "+linearSearch(arr,3));
		
	}
	public static int linearSearch(int nums[], int target) {
		for(int i=0; i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            

        }
		return -1;
    }

}

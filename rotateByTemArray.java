package org.nmiet;

public class Solution1 {
	public static void main(String [] args) {
		int [] arr= {1,2,3,4,5};
		rotateArrayByOne(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	public static void rotateArrayByOne(int[] nums) {  
        int k=1;
        int n=nums.length;
        int [] temp=new int[nums.length];
        for(int i=0; i< nums.length;i++) {
        	int newIndex=(i-k+n)%n;
        	temp[newIndex]=nums[i];
        	
        }
        
        for (int i=0; i<nums.length;i++){
        	nums[i]=temp[i];
            
        }
    }
}

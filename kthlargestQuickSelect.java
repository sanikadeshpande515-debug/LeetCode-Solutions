class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        quickSelect(nums,0,n-1,n-k);
        return nums[n-k];
        
    }
    public static int quickSelect(int [] arr,int low, int high, int k ){
        if(low< high){
            int pivotIndex=partition(arr,low,high);
            if(pivotIndex==k){
                return arr[pivotIndex];
            }
            else if(pivotIndex>k){
                 return quickSelect(arr,low,pivotIndex-1,k);
            }
            else
                return quickSelect(arr,pivotIndex+1,high,k);
        }
        return -1;
    }
    
    private static int partition(int [] arr, int low, int high){
        int pivote=arr[low];
        int i=low+1;
        int j=high;

        while(i<j){
            while(i<=high && arr[i]<=pivote){
                i++;
            }
            while(j>=low && arr[j]> pivote){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;

    }
    private static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

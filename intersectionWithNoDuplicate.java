class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        int i=0;
        int j=0;
        
        ArrayList<Integer> ans=new ArrayList<>();
        int n=a.length;
        int m=b.length;
        
        while(i<n && j<m){
            if(a[i]<b[j]){
                i++;
            }
            else if(b[j]<a[i]){
                j++;
            }
            else{
                if(ans.size()==0 || ans.get(ans.size()-1)!= a[i]){
                ans.add(a[i]);
                }
            
                i++;
                j++;
            }
        }
        return ans;
        
    }
}

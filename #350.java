mport java.util.HashMap;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int x:nums1){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for(int x:nums2){
            if(map.getOrDefault(x,0)>0){
                ans.add(x);
                map.put(x,map.getOrDefault(x,0)-1);
            }
        }
        int [] ans1=new int [ans.size()];
        for(int i=0; i<ans.size();i++){
            ans1[i]=ans.get(i);
        }

        return ans1;
    }
}

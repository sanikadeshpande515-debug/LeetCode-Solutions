import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map1= new HashMap<>();
        //added into hashmap
        for(int ele:arr){
            if(map1.containsKey(ele)){
                int freq=map1.get(ele);
                map1.put(ele,freq+1);
            }
            else{
                map1.put(ele,1);
            }

        }
        HashSet<Integer> Set1=new HashSet<>();
        for(int freq:map1.values()){
            if(Set1.contains(freq)){
                return false;
            }
            else{
                Set1.add(freq);
            }
        }


    return true;
        
    }
}

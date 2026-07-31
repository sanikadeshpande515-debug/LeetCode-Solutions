class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int count=0;
        int maxCount=Integer.MIN_VALUE;

        char [] arr=s.toCharArray();
        while(j<arr.length){
            if(isVowel(arr[j])){
            count=count+1;
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                maxCount=Math.max(maxCount,count);
                if(isVowel(arr[i])){
                     count--;
                }
                i++;
                j++;
            }

        }return maxCount;
        
    }
    public boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        else{
            return false;
        }
    }
}

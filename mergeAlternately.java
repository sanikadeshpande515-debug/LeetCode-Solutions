class Solution {
    public String mergeAlternately(String word1, String word2) {
      int i=0;
      int j=0;
      String newWord="";
      while(i<word1.length() || j<word2.length()){
        if(i<word1.length()){
            newWord=newWord+word1.charAt(i);
            i++;
        }
        if(j<word2.length()){
            newWord=newWord+word2.charAt(j);
            j++;
        }
    }
return newWord;
} 
}

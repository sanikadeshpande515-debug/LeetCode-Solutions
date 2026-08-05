class Solution {
    public String reverseWords(String s) {
        int n= s.length();
        int i=n-1;
        int j;
        StringBuilder ans=new StringBuilder();

        while(i>=0){
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }
            if(i<0){
                break;
            }
            j=i;
            while(i>=0 && s.charAt(i) != ' '){
                i--;

            }
         
            if(ans.length()>0){
                ans.append(" ");
            }
            ans.append(s.substring(i+1,j+1));
            
        }
        return ans.toString();
    
    }
}

class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack=new Stack<>();
        Stack<String> stringStack=new Stack<>();

        int number=0;
        String currentString="";

        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);

            if(Character.isDigit(ch)){
                number=number*10+(ch-'0');
            }
            else if(ch=='['){
                numStack.push(number);
                stringStack.push(currentString);

                number=0;
                currentString="";
            }
            else if(ch ==']'){
                int repeat=numStack.pop();//number in the stack 3[] here 3 is repeat
                String previousString =stringStack.pop();// number before the []

                String temp="";
                for(int j=0;j<repeat;j++){
                    temp +=currentString;
                }

                currentString=previousString+temp;
            }
            else{
                currentString+=ch;
            }

        }
        return currentString;
    }
}

class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack=new Stack<>();// stack declare
        for(int asteroid :asteroids){
            while(!stack.isEmpty() && stack.peek()>0 && asteroid<0){//collision condition
                if(stack.peek()<Math.abs(asteroid)){//pop
                    stack.pop();
                }
                else if(stack.peek()== Math.abs(asteroid)){//pop and make asteroid 0
                    stack.pop();
                    asteroid=0;
                }
                else{//peek wins
                    asteroid=0;
                }
            }
            if(asteroid !=0){// if its not zero after all the condition
                stack.push(asteroid);
            }
        }
        int[] result=new int[stack.size()];

        for(int i=0; i<stack.size();i++){
            result[i]=stack.get(i);
        }
        return result;
    }
}

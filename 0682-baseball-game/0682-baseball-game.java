class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int score = 0;
        for(String ch : operations){
            if(ch.equals("+")){
                int temp = 0;
                int f =stack.pop();
                int s =stack.pop();
                temp+=f;
                temp+=s;

                stack.push(s);
                stack.push(f);
                stack.push(temp);
            }
            else if(ch.equals("D")){
                
                int pop = stack.pop();
                int temp = pop * 2;
                stack.push(pop);
                stack.push(temp);
                
            }
            else if(ch.equals("C")){
                stack.pop();
            }

            else{
            
            score = Integer.parseInt(ch);
            stack.push(score);
            }
        }

        for(int num : stack){
            res+=num;
        }
        return res;

    }
}
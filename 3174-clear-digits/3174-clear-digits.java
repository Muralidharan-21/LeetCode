class Solution {
    public String clearDigits(String s) {

        Stack<Character> stack = new Stack<>();

        for(char x : s.toCharArray()){
            if(Character.isDigit(x) && !stack.isEmpty())
            {
                stack.pop();
            }
            else{
                stack.add(x);
            }
        }

        String res = "";
        for(char x : stack){
            res+=x;
        }
        return res;
        
    }
}
class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            if(!stack.isEmpty()
              && ((ch == ')' && stack.peek()=='(' )||( ch == ']' && stack.peek()=='[') ||( ch=='}' && stack.peek()=='{'))){
                stack.pop();
              }

            else{
                stack.push(ch);
            }
              
        

        }

        return stack.isEmpty();
        
    }
}
















// class Solution {
//     public boolean isValid(String s) {


//         Stack<Character> stack = new Stack<>();

//         for(char ch : s.toCharArray()){

//             if(ch == '(' || ch == '[' || ch == '{'){
//                 stack.push(ch);
//             }

//             else{

//                 if(stack.isEmpty()){return false;}
                
//                 char top = stack.pop();
//                 if(top == '(' && ch != ')'){return false;}
//                 if(top == '{' && ch != '}'){return false;}
//                 if(top == '[' && ch != ']'){return false;}
//             }


//         }
//         return stack.isEmpty();
//     }
// }
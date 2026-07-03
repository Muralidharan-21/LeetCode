class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            
            if(!stack.isEmpty() && ch==stack.peek()){
                stack.pop();
            }

            else
            stack.push(ch);
        }
        System.out.println(stack);

        StringBuilder res = new StringBuilder();

        for(char ch : stack){
            res.append(ch);
        }

        return res.toString();
        
        
    }
}
























// class Solution {
//     public String removeDuplicates(String s) {
        
//         Stack<Character> stack = new Stack<>();

//         for(char ch : s.toCharArray()){
//             if(!stack.isEmpty() && stack.peek() == ch){
//                 stack.pop();
//                 continue;
//             }
//             stack.push(ch);
//         }

//         StringBuilder res = new StringBuilder();

//         for(char ch : stack){
//             res.append(ch);
//         }

//         return res.toString();

     

//     }
// }
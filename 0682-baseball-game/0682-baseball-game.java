class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(String s : operations){
            
            if(s.equals("+")){
               int l = stack.pop();
               int sl = stack.pop();

               stack.push(sl);
               stack.push(l);
               stack.push(l+sl);
            }
            else if(s.equals("D")){
                stack.push(stack.peek()*2);
            }

            else if(s.equals("C")){stack.pop();}


            else{
                stack.push(Integer.parseInt(s));
            }

        }
        for(int i : stack){
            sum+=i;
        }
        return sum;
    }
}














// class Solution {
//     public int calPoints(String[] operations) {
        
//         Stack<Integer> stack = new Stack<>();
//         int res = 0;
//         int score = 0;
//         for(String ch : operations){
//             if(ch.equals("+")){
//                 int temp = 0;
//                 int f =stack.pop();
//                 int s =stack.pop();
//                 temp+=f;
//                 temp+=s;

//                 stack.push(s);
//                 stack.push(f);
//                 stack.push(temp);
//             }
//             else if(ch.equals("D")){
                
//                 int pop = stack.pop();
//                 int temp = pop * 2;
//                 stack.push(pop);
//                 stack.push(temp);
                
//             }
//             else if(ch.equals("C")){
//                 stack.pop();
//             }

//             else{
            
//             score = Integer.parseInt(ch);
//             stack.push(score);
//             }
//         }

//         for(int num : stack){
//             res+=num;
//         }
//         return res;

//     }
// }
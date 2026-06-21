class Solution {

    private String build(String s){

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch != '#'){
                stack.push(ch);
            }
            else if(!stack.isEmpty()){
                stack.pop();
            }
        }

        StringBuilder res = new StringBuilder();

        for(char sd : stack){
            res.append(sd);
        }
        return res.toString();
    }

    public boolean backspaceCompare(String s, String t) {

        return build(s).equals(build(t));
        
    }
}



// OPTIMISED SOLUTION 

// class Solution {
//     public boolean backspaceCompare(String s, String t) {

//         int i = s.length()-1;
//         int j = t.length()-1;

//         int Sskip =0;
//         int Tskip = 0;

//         while(i>= 0 || j >=0){

//             while(i>=0){
//                 if(s.charAt(i)=='#'){
//                     Sskip++;
//                     i--;
//                 }
//                 else if(Sskip>0){
//                     i--;
//                     Sskip--;
//                 }
//                 else break;
//             }

//             while(j>=0){
//                 if(t.charAt(j)=='#'){
//                     Tskip++;
//                     j--;
//                 }
//                 else if(Tskip>0){
//                     j--;
//                     Tskip--;
//                 }
//                 else break;
//             }


//             if(i>=0 && j >=0){
//                 if(s.charAt(i)!=t.charAt(j)){
//                     return false;
//                 }
//             }
//             else{
//                 if(i>=0 || j>=0){return false;}
//             }
//             i--;
//             j--;


//         }
//         return true;

        
//     }
// }
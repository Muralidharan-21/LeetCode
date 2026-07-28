class Solution {
    public int maxVowels(String s, int k) {

        String v = "aeiou";
        int max = 0;
        int c = 0;
        int left = 0;
        for(int right = 0 ;right<s.length();right++){

            if(v.contains(s.charAt(right)+"")){
                c++;
            }
            if(right -left +1 == k){
                max = Math.max(c,max);
                if(v.contains(s.charAt(left)+"")){
                    c--;
                }
                left++;
            }

        }
        return max;
        
        
    }
}
















// class Solution {
//     public int maxVowels(String s, int k) {

//         String vowel = "aeiou";

//         int res = 0;
//         int v_count = 0;
//         int left = 0;

//         for(int right = 0 ;right < s.length();right++){

//            if(isVowel(s.charAt(right))){
//                 v_count++;
//             }

//             if(right-left+1 == k){
//                 res = Math.max(res,v_count);
                
//                 if(isVowel(s.charAt(left))){
//                     v_count--;
//                 }
//                 left++;
//             }

//         }
//         return res;
        
//     }

//     public boolean isVowel(char ch){
//         return "aeiou".indexOf(ch) != -1;
//     }
// }
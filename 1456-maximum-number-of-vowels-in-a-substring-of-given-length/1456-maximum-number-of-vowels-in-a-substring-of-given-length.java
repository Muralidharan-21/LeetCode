class Solution {
    public int maxVowels(String s, int k) {
        
        int vc = 0;
        int left = 0;
        int res = 0;
        String v = "aeiou";

        for(int right =0 ; right<s.length() ;right++){
            if(v.contains(s.charAt(right)+"")){
                vc++;
            }
            while(right-left+1>k){
                if(v.contains(s.charAt(left)+"")){
                    vc--;
                }
                left++;
            }
            res = Math.max(res,vc);

        }
        return res;
    }
}

















// class Solution {
//     public int maxVowels(String s, int k) {

//         String v = "aeiou";
//         int max = 0;
//         int c = 0;
//         int left = 0;
//         for(int right = 0 ;right<s.length();right++){

//             if(v.contains(s.charAt(right)+"")){
//                 c++;
//             }
//             if(right -left +1 == k){
//                 max = Math.max(c,max);
//                 if(v.contains(s.charAt(left)+"")){
//                     c--;
//                 }
//                 left++;
//             }

//         }
//         return max;
        
        
//     }
// }
